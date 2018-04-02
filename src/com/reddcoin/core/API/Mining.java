package com.reddcoin.core.API;

import com.reddcoin.core.models.Configuration;
import com.reddcoin.core.models.MiningInfoResponse;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;


public class Mining
{
    private Configuration conf;

    public Mining(Configuration conf)
    {
        this.conf = conf;
    }

    public Call<MiningInfoResponse> getMiningInfo()
    {
        return ApiClient.getMiningClient(conf).getMiningInfo(new ArrayList<>());
    }

    public Call<Integer> getNetworkHashesPerSecond(int block, int height)
    {
        ArrayList<Integer> body = new ArrayList<>();
        body.add(block);
        body.add(height);
        return ApiClient.getMiningClient(conf).getNetworkHashesPerSecond(body);
    }
}
