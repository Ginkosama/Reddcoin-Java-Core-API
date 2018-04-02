package com.reddcoin.core.API;

import com.reddcoin.core.models.Configuration;
import com.reddcoin.core.models.InfoResponse;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;

public class Environment
{
    private Configuration conf;

    public Environment(Configuration conf)
    {
        this.conf = conf;
    }

    public Call<String> getHelp()
    {
        return ApiClient.getEnvironmentClient(conf).getHelp(new ArrayList<>());
    }

    public Call<InfoResponse> getInfo()
    {
        return ApiClient.getEnvironmentClient(conf).getInfo(new ArrayList<>());
    }
}
