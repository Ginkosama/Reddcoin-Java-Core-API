package com.reddcoin.core.API;

import com.reddcoin.core.models.*;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;
import java.util.HashMap;

public class Blockchain {
    private Configuration conf;

    public Blockchain(Configuration conf) {
        this.conf = conf;
    }

    public Call<String> getBestBlockhash() {
        return ApiClient.getBlockchainClient(conf).getBestBlockhash();
    }

    public Call<BlockResponse> GetBlock(String hash) {
        HashMap<String, Object> body = new HashMap<>();
        body.put("hash", hash);
        return ApiClient.getBlockchainClient(conf).getBlock(body);
    }

    public Call<Integer> getBlockCount() {
        return ApiClient.getBlockchainClient(conf).getBlockCount();
    }

    public Call<String> getBlockHash(int blockHeight) {
        HashMap<String, Object> body = new HashMap<>();
        body.put("blockHeight", blockHeight);
        return ApiClient.getBlockchainClient(conf).getBlockHash(body);
    }

    public Call<BlockchainInfoResponse> getBlockchainInfo() {
        return ApiClient.getBlockchainClient(conf).getBlockchainInfo();
    }

    public Call<ArrayList<String>> getRawMemPool() {
        return ApiClient.getBlockchainClient(conf).getRawMemPool();
    }

    public Call<TransactionOutputResponse> getTransactionOutput(String transactionId, int voutNumber, boolean includeMemoryPool)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("transactionId", transactionId);
        body.put("voutNumber", voutNumber);
        body.put("includeMemoryPool", includeMemoryPool);
        return ApiClient.getBlockchainClient(conf).getTransactionOutput(body);
    }

    public Call<TransactionOutputSetInfoResponse> getTransactionOutputSetInfo()
    {
        return ApiClient.getBlockchainClient(conf).getTransactionOutputSetInfo();
    }

    public Call<Boolean> verifyChain()
    {
        return ApiClient.getBlockchainClient(conf).verifyChain();
    }

    public Call<Boolean> verifyChain(int checkLevel)
    {
        HashMap<String, Integer> body = new HashMap<>();
        body.put("checkLevel", checkLevel);
        return ApiClient.getBlockchainClient(conf).verifyChain(body);
    }

    public Call<Boolean> verifyChain(int checkLevel, int numberOfBlocks)
    {
        HashMap<String, Integer> body = new HashMap<>();
        body.put("checkLevel", checkLevel);
        body.put("numberOfBlocks", numberOfBlocks);
        return ApiClient.getBlockchainClient(conf).verifyChain(body);
    }
}
