package com.reddcoin.core.API;

import com.reddcoin.core.models.Configuration;
import com.reddcoin.core.models.MiningInfoResponse;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.HashMap;

public class Mining
{
    private Configuration conf;

    public Mining(Configuration conf)
    {
        this.conf = conf;
    }

    public Call<MiningInfoResponse> getMiningInfo()
    {
        return ApiClient.getMiningClient(conf).getMiningInfo();
    }

    public Call<Integer> getNetworkHashesPerSecond(int block, int height)
    {
        HashMap<String, Integer> body = new HashMap<>();
        body.put("block", block);
        body.put("height", height);
        return ApiClient.getMiningClient(conf).getNetworkHashesPerSecond(body);
    }
}
