package com.reddcoin.core.services;

import com.reddcoin.core.models.NetTotalResponse;
import com.reddcoin.core.models.NetworkInfoResponse;
import com.reddcoin.core.models.PeerInfoResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;

public interface NetworkService
{
    @JsonRPC("GetConnectionCount")
    Call<Integer> getConnectionCount();

    @JsonRPC("GetNetTotals")
    Call<NetTotalResponse> getNetTotals();

    @JsonRPC("GetNetworkInfo")
    Call<NetworkInfoResponse> getNetworkInfo();

    @JsonRPC("GetPeerInfo")
    Call<PeerInfoResponse> getPeerInfo();
}
