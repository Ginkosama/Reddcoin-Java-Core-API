package com.reddcoin.core.services;

import com.reddcoin.core.models.MiningInfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.ArrayList;

public interface MiningService
{
    @JsonRPC("getmininginfo") @POST("/")
    Call<MiningInfoResponse> getMiningInfo(ArrayList<Object> body);

    @JsonRPC("getnetworkhashps") @POST("/")
    Call<Integer> getNetworkHashesPerSecond(@Body ArrayList<Integer> body);
}
