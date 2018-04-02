package com.reddcoin.core.services;

import com.reddcoin.core.models.ValidateAddressResponse;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import java.util.ArrayList;

public interface UtilitiesService
{
    @JsonRPC("signmessage") @POST("/")
    Call<String> signMessage(@Body ArrayList<String> body);

    @JsonRPC("validateaddress") @POST("/")
    Call<ValidateAddressResponse> validateAddress(@Body ArrayList<String> body);

    @JsonRPC("verifymessage") @POST("/")
    Call<Boolean> verifyMessage(@Body ArrayList<String> body);
}
