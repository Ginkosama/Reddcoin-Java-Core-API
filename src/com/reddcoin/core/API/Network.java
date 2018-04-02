package com.reddcoin.core.API;

import com.reddcoin.core.models.Configuration;
import com.reddcoin.core.models.NetTotalResponse;
import com.reddcoin.core.models.NetworkInfoResponse;
import com.reddcoin.core.models.PeerInfoResponse;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;

public class Network
{
    private Configuration conf;

    public Network(Configuration conf)
    {
        this.conf = conf;
    }

    public Call<Integer> getConnectionCount()
    {
        return ApiClient.getNetworkClient(conf).getConnectionCount(new ArrayList<>());
    }

    public Call<NetTotalResponse> getNetTotals()
    {
        return ApiClient.getNetworkClient(conf).getNetTotals(new ArrayList<>());
    }

    public Call<NetworkInfoResponse> getNetworkInfo()
    {
        return ApiClient.getNetworkClient(conf).getNetworkInfo(new ArrayList<>());
    }

    public Call<PeerInfoResponse> getPeerInfo()
    {
        return ApiClient.getNetworkClient(conf).getPeerInfo(new ArrayList<>());
    }
}
