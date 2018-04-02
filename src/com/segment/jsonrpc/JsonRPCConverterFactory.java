package com.segment.jsonrpc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class JsonRPCConverterFactory extends Converter.Factory {
    public static JsonRPCConverterFactory create() {
        return new JsonRPCConverterFactory();
    }

    private JsonRPCConverterFactory() {
        // Private constructor.
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type,
                                                            Annotation[] annotations,
                                                            Retrofit retrofit) {
        if (!Utils.isAnnotationPresent(annotations, JsonRPC.class)) {
            return null;
        }

        Type rpcType = Types.newParameterizedType(JsonRPCResponse.class, type);
        Converter<ResponseBody, JsonRPCResponse> delegate =
                retrofit.nextResponseBodyConverter(this, rpcType, annotations);
        //noinspection unchecked
        return new JsonRPCResponseBodyConverter(delegate);
    }

    static class JsonRPCResponseBodyConverter<T> implements Converter<ResponseBody, T> {
        final Converter<ResponseBody, JsonRPCResponse<T>> delegate;

        JsonRPCResponseBodyConverter(Converter<ResponseBody, JsonRPCResponse<T>> delegate) {
            this.delegate = delegate;
        }

        @Override public T convert(ResponseBody responseBody) throws IOException {
            JsonRPCResponse<T> response = delegate.convert(responseBody);
            return response.result;
        }
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotations,
                                                          Annotation[] methodAnnotations, Retrofit retrofit) {
        JsonRPC methodAnnotation = Utils.findAnnotation(methodAnnotations, JsonRPC.class);
        if (methodAnnotation == null) {
            return null;
        }
        String method = methodAnnotation.value();

        Converter<JsonRPCRequest, RequestBody> delegate =
                retrofit.nextRequestBodyConverter(this, JsonRPCRequest.class, annotations,
                        methodAnnotations);
        //noinspection unchecked
        return new JsonRPCRequestBodyConverter(method, delegate);
    }

    static class JsonRPCRequestBodyConverter<T> implements Converter<T, RequestBody> {
        final String method;
        final Converter<JsonRPCRequest, RequestBody> delegate;

        JsonRPCRequestBodyConverter(String method, Converter<JsonRPCRequest, RequestBody> delegate) {
            this.method = method;
            this.delegate = delegate;
        }

        @Override public RequestBody convert(T value) throws IOException {
            return delegate.convert(JsonRPCRequest.create(method, value));
        }
    }
}