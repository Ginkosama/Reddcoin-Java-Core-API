package com.reddcoin.core.API;

import com.reddcoin.core.models.*;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;

public class Blockchain {
    private Configuration conf;

    public Blockchain(Configuration conf) {
        this.conf = conf;
    }

    public Call<String> getBestBlockhash() {
        return ApiClient.getBlockchainClient(conf).getBestBlockhash(new ArrayList<>());
    }

    public Call<BlockResponse> GetBlock(String hash) {
        ArrayList<Object> body = new ArrayList<>();
        body.add(hash);
        return ApiClient.getBlockchainClient(conf).getBlock(body);
    }

    public Call<Integer> getBlockCount() {
        return ApiClient.getBlockchainClient(conf).getBlockCount(new ArrayList<>());
    }

    public Call<String> getBlockHash(int blockHeight) {
        ArrayList<Object> body = new ArrayList<>();
        body.add(blockHeight);
        return ApiClient.getBlockchainClient(conf).getBlockHash(body);
    }

    public Call<BlockchainInfoResponse> getBlockchainInfo() {
        return ApiClient.getBlockchainClient(conf).getBlockchainInfo(new ArrayList<>());
    }

    public Call<ArrayList<String>> getRawMemPool() {
        return ApiClient.getBlockchainClient(conf).getRawMemPool(new ArrayList<>());
    }

    public Call<TransactionOutputResponse> getTransactionOutput(String transactionId, int voutNumber, boolean includeMemoryPool)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(transactionId);
        body.add(voutNumber);
        body.add(includeMemoryPool);
        return ApiClient.getBlockchainClient(conf).getTransactionOutput(body);
    }

    public Call<TransactionOutputSetInfoResponse> getTransactionOutputSetInfo()
    {
        return ApiClient.getBlockchainClient(conf).getTransactionOutputSetInfo(new ArrayList<>());
    }

    public Call<Boolean> verifyChain()
    {
        return ApiClient.getBlockchainClient(conf).verifyChain(new ArrayList<>());
    }

    public Call<Boolean> verifyChain(int checkLevel)
    {
        ArrayList<Integer> body = new ArrayList<>();
        body.add(checkLevel);
        return ApiClient.getBlockchainClient(conf).verifyChain(body);
    }

    public Call<Boolean> verifyChain(int checkLevel, int numberOfBlocks)
    {
        ArrayList<Integer> body = new ArrayList<>();
        body.add(checkLevel);
        body.add(numberOfBlocks);
        return ApiClient.getBlockchainClient(conf).verifyChain(body);
    }
}
