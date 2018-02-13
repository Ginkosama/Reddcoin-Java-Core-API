package com.reddcoin.core.services;

import com.reddcoin.core.models.ValidateAddressResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;

import java.util.HashMap;

public interface UtilitiesService
{
    @JsonRPC("SignMessage")
    Call<String> signMessage(@Body HashMap<String, String> body);

    @JsonRPC("ValidateAddress")
    Call<ValidateAddressResponse> validateAddress(@Body HashMap<String, String> body);

    @JsonRPC("VerifyMessage")
    Call<Boolean> verifyMessage(@Body HashMap<String, String> body);
}
