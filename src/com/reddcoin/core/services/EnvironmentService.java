package com.reddcoin.core.services;

import com.reddcoin.core.models.InfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;

public interface EnvironmentService
{
    @JsonRPC("Help")
    Call<String> getHelp();

    @JsonRPC("GetInfo")
    Call<InfoResponse> getInfo();
}
