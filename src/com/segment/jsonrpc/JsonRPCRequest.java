package com.segment.jsonrpc;

import java.util.*;

class JsonRPCRequest {
    static final Random RANDOM = new Random();

    final String method;
    final List<Object> params;
    final long id;

    JsonRPCRequest(String method, List<Object> params, long id) {
        this.method = method;
        this.params = params;
        this.id = id;
    }

    static JsonRPCRequest create(String method, Object args) {
        long id = Math.abs(RANDOM.nextLong());
        if(args == null)
            return new JsonRPCRequest(method, new ArrayList<>(), id);

        if(args instanceof List<?>)
            return new JsonRPCRequest(method, (List<Object>) args, id);

        return new JsonRPCRequest(method, Collections.singletonList(args), id);
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsonRPCRequest that = (JsonRPCRequest) o;

        if (id != that.id) return false;
        if (!method.equals(that.method)) return false;
        return params.equals(that.params);
    }

    @Override public int hashCode() {
        int result = method.hashCode();
        result = 31 * result + params.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}