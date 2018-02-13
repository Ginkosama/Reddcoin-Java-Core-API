package com.reddcoin.core.services;

import com.reddcoin.core.models.BlockResponse;
import com.reddcoin.core.models.BlockchainInfoResponse;
import com.reddcoin.core.models.TransactionOutputResponse;
import com.reddcoin.core.models.TransactionOutputSetInfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;

import java.util.ArrayList;
import java.util.HashMap;

public interface BlockchainService
{
    @JsonRPC("GetBestBlockhash")
    Call<String> getBestBlockhash();

    @JsonRPC("GetBlock")
    Call<BlockResponse> getBlock(@Body HashMap<String, Object> body);

    @JsonRPC("GetBlockCount")
    Call<Integer> getBlockCount();

    @JsonRPC("GetBlockHash")
    Call<String> getBlockHash(@Body HashMap<String, Object> body);

    @JsonRPC("GetBlockchainInfo")
    Call<BlockchainInfoResponse> getBlockchainInfo();

    @JsonRPC("GetRawMemPool")
    Call<ArrayList<String>> getRawMemPool();

    @JsonRPC("GetTxOut")
    Call<TransactionOutputResponse> getTransactionOutput(@Body HashMap<String, Object> body);

    @JsonRPC("GetTxOutsetInfo")
    Call<TransactionOutputSetInfoResponse> getTransactionOutputSetInfo();

    @JsonRPC("VerifyChain")
    Call<Boolean> verifyChain();

    @JsonRPC("VerifyChain")
    Call<Boolean> verifyChain(@Body HashMap<String, Integer> body);
}
