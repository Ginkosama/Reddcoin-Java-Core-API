package com.reddcoin.core.services;

import com.reddcoin.core.models.InfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.POST;

import java.util.ArrayList;

public interface EnvironmentService
{
    @JsonRPC("help") @POST("/")
    Call<String> getHelp(ArrayList<Object> body);

    @JsonRPC("getinfo") @POST("/")
    Call<InfoResponse> getInfo(ArrayList<Object> body);
}
