package com.reddcoin.core.services;

import com.reddcoin.core.models.BlockResponse;
import com.reddcoin.core.models.BlockchainInfoResponse;
import com.reddcoin.core.models.TransactionOutputResponse;
import com.reddcoin.core.models.TransactionOutputSetInfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.ArrayList;

public interface BlockchainService
{
    @JsonRPC("getbestblockhash") @POST("/")
    Call<String> getBestBlockhash(@Body ArrayList<Object> body);

    @JsonRPC("getblock") @POST("/")
    Call<BlockResponse> getBlock(@Body ArrayList<Object> body);

    @JsonRPC("getblockcount") @POST("/")
    Call<Integer> getBlockCount(@Body ArrayList<Object> body);

    @JsonRPC("getblockhash") @POST("/")
    Call<String> getBlockHash(@Body ArrayList<Object> body);

    @JsonRPC("getblockchaininfo") @POST("/")
    Call<BlockchainInfoResponse> getBlockchainInfo(@Body ArrayList<Object> body);

    @JsonRPC("getrawmempool") @POST("/")
    Call<ArrayList<String>> getRawMemPool(@Body ArrayList<Object> body);

    @JsonRPC("gettxout") @POST("/")
    Call<TransactionOutputResponse> getTransactionOutput(@Body ArrayList<Object> body);

    @JsonRPC("gettxoutsetinfo") @POST("/")
    Call<TransactionOutputSetInfoResponse> getTransactionOutputSetInfo(@Body ArrayList<Object> body);

    @JsonRPC("verifychain") @POST("/")
    Call<Boolean> verifyChain(@Body ArrayList<Integer> body);
}
