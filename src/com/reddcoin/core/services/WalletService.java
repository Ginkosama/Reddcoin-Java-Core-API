package com.reddcoin.core.services;

import com.reddcoin.core.models.*;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.ArrayList;

public interface WalletService
{
    @JsonRPC("addmultisigaddress") @POST("/")
    Call<Float> addMultiSigAddress(@Body ArrayList<Object> body);

    @JsonRPC("backupwallet") @POST("/")
    Call<Object> backupWallet(@Body ArrayList<String> body);

    @JsonRPC("walletpassphrasechange") @POST("/")
    Call<Object> changeWalletPasswordPhrase(@Body ArrayList<String> body);

    @JsonRPC("dumpprivkey") @POST("/")
    Call<String> exportPrivateKey(@Body ArrayList<String> body);

    @JsonRPC("getaccount") @POST("/")
    Call<String> getAccount(@Body ArrayList<String> body);

    @JsonRPC("getaddressesbyaccount") @POST("/")
    Call<String> getAccountAddresses(@Body ArrayList<String> body);

    @JsonRPC("getbalance") @POST("/")
    Call<Float> getBalance(@Body ArrayList<Object> body);

    @JsonRPC("getinterest") @POST("/")
    Call<Float> getInterest(@Body ArrayList<Object> body);

    @JsonRPC("getnewaddress") @POST("/")
    Call<String> getNewAddress(@Body ArrayList<String> body);

    @JsonRPC("getrawtransaction") @POST("/")
    Call<RawTransactionResponse> getRawTransaction(@Body ArrayList<String> body);

    @JsonRPC("getreceivedbyaccount") @POST("/")
    Call<Float> getReceivedByAccount(@Body ArrayList<Object> body);

    @JsonRPC("getreceivedbyaddress") @POST("/")
    Call<Float> getReceivedByAddress(@Body ArrayList<Object> body);

    @JsonRPC("getstakinginfo") @POST("/")
    Call<StakingInfoResponse> getStakingInfo(@Body ArrayList<Object> body);

    @JsonRPC("gettransaction") @POST("/")
    Call<TransactionResponse> getTransaction(@Body ArrayList<String> body);

    @JsonRPC("getunconfirmedbalance") @POST("/")
    Call<Float> getUnconfirmedBalance(@Body ArrayList<Object> body);

    @JsonRPC("getwalletinfo") @POST("/")
    Call<WalletResponse> getWalletInfo(@Body ArrayList<Object> body);

    @JsonRPC("importprivkey") @POST("/")
    Call<Float> importPrivateKey(@Body ArrayList<Object> body);

    @JsonRPC("listaccounts") @POST("/")
    Call<ArrayList<Float>> listAccounts(@Body ArrayList<Integer> body);

    @JsonRPC("listaddressgroupings") @POST("/")
    Call<Object> listAddressGroupings(@Body ArrayList<Object> body);

    @JsonRPC("listlockunspent") @POST("/")
    Call<Object> listLockUnspent(@Body ArrayList<Object> body);

    @JsonRPC("listreceivedbyaccount") @POST("/")
    Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount(@Body ArrayList<Object> body);

    @JsonRPC("listreceivedbyaddress") @POST("/")
    Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress(@Body ArrayList<Object> body);

    @JsonRPC("listsinceblock") @POST("/")
    Call<ArrayList<SinceBlockResponse>> listSinceBlock(@Body ArrayList<Object> body);

    @JsonRPC("listtransactions") @POST("/")
    Call<ArrayList<TransactionsResponse>> listTransactions(@Body ArrayList<Object> body);

    @JsonRPC("listunspent") @POST("/")
    Call<ArrayList<UnspentResponse>> listUnspent(@Body ArrayList<Integer> body);

    @JsonRPC("walletlock") @POST("/")
    Call<Object> lockWallet(@Body ArrayList<Object> body);

    @JsonRPC("move") @POST("/")
    Call<Float> moveReddcoins(@Body ArrayList<Object> body);

    @JsonRPC("sendfrom") @POST("/")
    Call<String> sendReddcoinsFromAccount(@Body ArrayList<Object> body);

    @JsonRPC("sendtoaddress") @POST("/")
    Call<String> sendReddcoinsToAddress(@Body ArrayList<Object> body);

    @JsonRPC("setaccount") @POST("/")
    Call<Object> setAccount(@Body ArrayList<String> body);

    @JsonRPC("settxfee") @POST("/")
    Call<Boolean> setTransactionFee(@Body ArrayList<Float> body);

    @JsonRPC("walletpassphrase") @POST("/")
    Call<Object> unlockWallet(@Body ArrayList<Object> body);
}
