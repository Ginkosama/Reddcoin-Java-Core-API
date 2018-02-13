package com.reddcoin.core.services;

import com.reddcoin.core.models.Configuration;
import com.segment.jsonrpc.JsonRPCConverterFactory;
import okhttp3.*;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;

public class ApiClient
{
    private static BlockchainService BLOCKCHAIN_CLIENT;
    private static EnvironmentService ENVIRONMENT_CLIENT;
    private static MiningService MINING_CLIENT;
    private static NetworkService NETWORK_CLIENT;
    private static UtilitiesService UTILITIES_CLIENT;
    private static WalletService WALLET_CLIENT;

    private static class BasicAuthInterceptor implements Interceptor
    {
        private String credentials;

        public BasicAuthInterceptor(String user, String password)
        {
            this.credentials = Credentials.basic(user, password);
        }

        @Override
        public Response intercept(Chain chain) throws IOException
        {
            return chain.proceed(chain.request().newBuilder().header("Authorization", credentials).build());
        }

    }

    private static OkHttpClient getClient(String user, String password)
    {
        return new OkHttpClient().newBuilder().addInterceptor(new BasicAuthInterceptor(user, password)).build();
    }

    public static BlockchainService getBlockchainClient(Configuration conf) {
        if(BLOCKCHAIN_CLIENT == null)
        {
            BLOCKCHAIN_CLIENT = new Retrofit.Builder()
                    .client(getClient(conf.getUsername(), conf.getPassword()))
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(BlockchainService.class);
        }

        return BLOCKCHAIN_CLIENT;
    }

    public static EnvironmentService getEnvironmentClient(Configuration conf) {
        if(ENVIRONMENT_CLIENT == null)
        {
            ENVIRONMENT_CLIENT = new Retrofit.Builder()
                    .client(getClient(conf.getUsername(), conf.getPassword()))
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(EnvironmentService.class);
        }

        return ENVIRONMENT_CLIENT;
    }

    public static MiningService getMiningClient(Configuration conf) {
        if(MINING_CLIENT == null)
        {
            MINING_CLIENT = new Retrofit.Builder()
                    .client(getClient(conf.getUsername(), conf.getPassword()))
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(MiningService.class);
        }

        return MINING_CLIENT;
    }

    public static NetworkService getNetworkClient(Configuration conf) {
        if(NETWORK_CLIENT == null)
        {
            NETWORK_CLIENT = new Retrofit.Builder()
                    .client(getClient(conf.getUsername(), conf.getPassword()))
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(NetworkService.class);
        }

        return NETWORK_CLIENT;
    }

    public static UtilitiesService getUtilitiesClient(Configuration conf) {
        if(UTILITIES_CLIENT == null)
        {
            UTILITIES_CLIENT = new Retrofit.Builder()
                    .client(getClient(conf.getUsername(), conf.getPassword()))
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(UtilitiesService.class);
        }

        return UTILITIES_CLIENT;
    }

    public static WalletService getWalletClient(Configuration conf) {
        if(WALLET_CLIENT == null)
        {
            WALLET_CLIENT = new Retrofit.Builder()
                    .client(getClient(conf.getUsername(), conf.getPassword()))
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(WalletService.class);
        }

        return WALLET_CLIENT;
    }
}
