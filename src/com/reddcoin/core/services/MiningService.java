package com.reddcoin.core.services;

import com.reddcoin.core.models.MiningInfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;

import java.util.HashMap;

public interface MiningService
{
    @JsonRPC("GetMiningInfo")
    Call<MiningInfoResponse> getMiningInfo();

    @JsonRPC("GetNetworkHashps")
    Call<Integer> getNetworkHashesPerSecond(@Body HashMap<String, Integer> body);
}
