package com.reddcoin.core.services;

import com.reddcoin.core.models.Configuration;
import com.segment.jsonrpc.JsonRPCConverterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiClient
{
    private static BlockchainService BLOCKCHAIN_CLIENT;
    private static EnvironmentService ENVIRONMENT_CLIENT;
    private static MiningService MINING_CLIENT;
    private static NetworkService NETWORK_CLIENT;
    private static UtilitiesService UTILITIES_CLIENT;
    private static WalletService WALLET_CLIENT;

    public static BlockchainService getBlockchainClient(Configuration conf) {
        if(BLOCKCHAIN_CLIENT == null)
        {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            BLOCKCHAIN_CLIENT = new Retrofit.Builder()
                    .client(client)
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
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            ENVIRONMENT_CLIENT = new Retrofit.Builder()
                    .client(client)
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
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MINING_CLIENT = new Retrofit.Builder()
                    .client(client)
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
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            NETWORK_CLIENT = new Retrofit.Builder()
                    .client(client)
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
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            UTILITIES_CLIENT = new Retrofit.Builder()
                    .client(client)
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
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            WALLET_CLIENT = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(conf.getUrl())
                    .addConverterFactory(JsonRPCConverterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
                    .create(WalletService.class);
        }

        return WALLET_CLIENT;
    }
}
