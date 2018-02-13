package com.reddcoin.core.services;

import com.reddcoin.core.models.*;
import com.segment.jsonrpc.JsonRPC;
import retrofit2.Call;
import retrofit2.http.Body;

import java.util.ArrayList;
import java.util.HashMap;

public interface WalletService
{
    @JsonRPC("AddMultiSigAddress")
    Call<Float> addMultiSigAddress();

    @JsonRPC("BackupWallet")
    Call<Object> backupWallet(@Body HashMap<String, String> body);

    @JsonRPC("WalletPassPhraseChange")
    Call<Object> changeWalletPasswordPhrase(@Body HashMap<String, String> body);

    @JsonRPC("DumpPrivKey")
    Call<String> exportPrivateKey(@Body HashMap<String, String> body);

    @JsonRPC("GetAccount")
    Call<String> getAccount(@Body HashMap<String, String> body);

    @JsonRPC("GetAddressesByAccount")
    Call<String> getAccountAddresses(@Body HashMap<String, String> body);

    @JsonRPC("GetBalance")
    Call<Float> getBalance();

    @JsonRPC("GetBalance")
    Call<Float> getBalance(@Body HashMap<String, Object> body);

    @JsonRPC("GetInterest")
    Call<Float> getInterest();

    @JsonRPC("GetRawTransaction")
    Call<RawTransactionResponse> getRawTransaction(@Body HashMap<String, String> body);

    @JsonRPC("GetReceivedByAccount")
    Call<Float> getReceivedByAccount(@Body HashMap<String, Object> body);

    @JsonRPC("GetReceivedByAddress")
    Call<Float> getReceivedByAddress(@Body HashMap<String, Object> body);

    @JsonRPC("GetStakingInfo")
    Call<StakingInfoResponse> getStakingInfo();

    @JsonRPC("GetTransaction")
    Call<TransactionResponse> getTransaction(@Body HashMap<String, String> body);

    @JsonRPC("GetUnconfirmedBalance")
    Call<Float> getUnconfirmedBalance();

    @JsonRPC("GetWalletInfo")
    Call<WalletResponse> getWalletInfo();

    @JsonRPC("ImportPrivKey")
    Call<Float> importPrivateKey(@Body HashMap<String, Object> body);

    @JsonRPC("ListAccounts")
    Call<HashMap<String, Float>> listAccounts();

    @JsonRPC("ListAccounts")
    Call<HashMap<String, Float>> listAccounts(@Body HashMap<String, Integer> body);

    @JsonRPC("ListAddressGroupings")
    Call<Object> listAddressGroupings();

    @JsonRPC("ListLockUnspent")
    Call<Object> listLockUnspent();

    @JsonRPC("ListReceivedByAccount")
    Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount();

    @JsonRPC("ListReceivedByAccount")
    Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount(@Body HashMap<String, Object> body);

    @JsonRPC("ListReceivedByAddress")
    Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress();

    @JsonRPC("ListReceivedByAddress")
    Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress(@Body HashMap<String, Object> body);

    @JsonRPC("ListSinceBlock")
    Call<ArrayList<SinceBlockResponse>> listSinceBlock();

    @JsonRPC("ListSinceBlock")
    Call<ArrayList<SinceBlockResponse>> listSinceBlock(@Body HashMap<String, Object> body);

    @JsonRPC("ListTransactions")
    Call<ArrayList<TransactionsResponse>> listTransactions();

    @JsonRPC("ListTransactions")
    Call<ArrayList<TransactionsResponse>> listTransactions(@Body HashMap<String, Object> body);

    @JsonRPC("ListUnspent")
    Call<ArrayList<UnspentResponse>> listUnspent();

    @JsonRPC("ListUnspent")
    Call<ArrayList<UnspentResponse>> listUnspent(@Body HashMap<String, Integer> body);

    @JsonRPC("WalletLock")
    Call<Object> lockWallet();

    @JsonRPC("Move")
    Call<Float> moveReddcoins(@Body HashMap<String, Object> body);

    @JsonRPC("SendFrom")
    Call<String> sendReddcoinsFromAccount(@Body HashMap<String, Object> body);

    @JsonRPC("SendToAddress")
    Call<String> sendReddcoinsToAddress(@Body HashMap<String, Object> body);

    @JsonRPC("SetAccount")
    Call<Object> setAccount(@Body HashMap<String, String> body);

    @JsonRPC("SetTxFee")
    Call<Boolean> setTransactionFee(@Body HashMap<String, Float> body);

    @JsonRPC("WalletPassPhrase")
    Call<Object> unlockWallet(@Body HashMap<String, Object> body);
}
