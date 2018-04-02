package com.reddcoin.core.services;

import com.reddcoin.core.models.NetTotalResponse;
import com.reddcoin.core.models.NetworkInfoResponse;
import com.reddcoin.core.models.PeerInfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.ArrayList;

public interface NetworkService
{
    @JsonRPC("getconnectioncount") @POST("/")
    Call<Integer> getConnectionCount(@Body ArrayList<Object> body);

    @JsonRPC("getnettotals") @POST("/")
    Call<NetTotalResponse> getNetTotals(@Body ArrayList<Object> body);

    @JsonRPC("getnetworkinfo") @POST("/")
    Call<NetworkInfoResponse> getNetworkInfo(@Body ArrayList<Object> body);

    @JsonRPC("getpeerinfo") @POST("/")
    Call<PeerInfoResponse> getPeerInfo(@Body ArrayList<Object> body);
}
