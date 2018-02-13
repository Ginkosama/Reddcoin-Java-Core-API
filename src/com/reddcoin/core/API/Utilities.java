package com.reddcoin.core.API;

import com.reddcoin.core.models.Configuration;
import com.reddcoin.core.models.ValidateAddressResponse;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

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
        HashMap<String, String> body = new HashMap<>();
        body.put("address", address);
        body.put("message", message);
        return ApiClient.getUtilitiesClient(conf).signMessage(body);
    }

    public Call<ValidateAddressResponse> validateAddress(String address)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("address", address);
        return ApiClient.getUtilitiesClient(conf).validateAddress(body);
    }

    public Call<Boolean> verifyMessage(String address, String signature, String message)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("address", address);
        body.put("signature", address);
        body.put("message", address);
        return ApiClient.getUtilitiesClient(conf).verifyMessage(body);
    }
}
