package com.reddcoin.core.API;

import com.reddcoin.core.models.Configuration;
import com.reddcoin.core.models.ValidateAddressResponse;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;
import java.util.HashMap;

public class Utilities
{
    private Configuration conf;

    public Utilities(Configuration conf)
    {
        this.conf = conf;
    }

    public Call<String> SignMessage(String address, String message)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(address);
        body.add(message);
        return ApiClient.getUtilitiesClient(conf).signMessage(body);
    }

    public Call<ValidateAddressResponse> validateAddress(String address)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(address);
        return ApiClient.getUtilitiesClient(conf).validateAddress(body);
    }

    public Call<Boolean> verifyMessage(String address, String signature, String message)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(address);
        body.add(signature);
        body.add(message);
        return ApiClient.getUtilitiesClient(conf).verifyMessage(body);
    }
}
