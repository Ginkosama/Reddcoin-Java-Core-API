package com.reddcoin.core.API;

import com.reddcoin.core.models.*;
import com.reddcoin.core.services.ApiClient;
import retrofit2.Call;

import java.util.ArrayList;
import java.util.HashMap;

public class Wallet
{
    private Configuration conf;

    public Wallet(Configuration conf)
    {
        this.conf = conf;
    }

    public Call<Float> addMultiSigAddress()
    {
        return ApiClient.getWalletClient(conf).addMultiSigAddress();
    }

    public Call<Object> backupWallet(String destination)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("destination", destination);
        return ApiClient.getWalletClient(conf).backupWallet(body);
    }

    public Call<Object> changeWalletPasswordPhrase(String oldPassPhrase, String newPassPhrase)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("oldPassPhrase", oldPassPhrase);
        body.put("newPassPhrase", newPassPhrase);
        return ApiClient.getWalletClient(conf).changeWalletPasswordPhrase(body);
    }

    public Call<String> exportPrivateKey(String address)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("address", address);
        return ApiClient.getWalletClient(conf).exportPrivateKey(body);
    }

    public Call<String> getAccount(String accountName)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("accountName", accountName);
        return ApiClient.getWalletClient(conf).getAccount(body);
    }

    public Call<String> getAccountAddresses(String accountName)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("accountName", accountName);
        return ApiClient.getWalletClient(conf).getAccountAddresses(body);
    }

    public Call<Float> getBalance()
    {
        return ApiClient.getWalletClient(conf).getBalance();
    }

    public Call<Float> getBalance(String account)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("account", account);
        return ApiClient.getWalletClient(conf).getBalance(body);
    }

    public Call<Float> getBalance(String account, int minimumAmountOfConfirmations)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("account", account);
        body.put("minimumAmountOfConfirmations", minimumAmountOfConfirmations);
        return ApiClient.getWalletClient(conf).getBalance(body);
    }

    public Call<Float> getInterest()
    {
        return ApiClient.getWalletClient(conf).getInterest();
    }

    public Call<RawTransactionResponse> getRawTransaction(String transactionId)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("transactionId", transactionId);
        return ApiClient.getWalletClient(conf).getRawTransaction(body);
    }

    public Call<Float> getReceivedByAccount(String accountName)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("accountName", accountName);
        return ApiClient.getWalletClient(conf).getReceivedByAccount(body);
    }

    public Call<Float> getReceivedByAccount(String accountName, int minimumConfirmation)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("accountName", accountName);
        body.put("minimumConfirmation", minimumConfirmation);
        return ApiClient.getWalletClient(conf).getReceivedByAccount(body);
    }

    public Call<Float> getReceivedByAddress(String address)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("address", address);
        return ApiClient.getWalletClient(conf).getReceivedByAddress(body);
    }

    public Call<Float> getReceivedByAddress(String address, int minimumConfirmation)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("address", address);
        body.put("minimumConfirmation", minimumConfirmation);
        return ApiClient.getWalletClient(conf).getReceivedByAddress(body);
    }

    public Call<StakingInfoResponse> getStakingInfo()
    {
        return ApiClient.getWalletClient(conf).getStakingInfo();
    }

    public Call<TransactionResponse> getTransaction(String transactionId)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("transactionId", transactionId);
        return ApiClient.getWalletClient(conf).getTransaction(body);
    }

    public Call<Float> getUnconfirmedBalance()
    {
        return ApiClient.getWalletClient(conf).getUnconfirmedBalance();
    }

    public Call<WalletResponse> getWalletInfo()
    {
        return ApiClient.getWalletClient(conf).getWalletInfo();
    }

    public Call<Float> importPrivateKey(String privateKey)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("privateKey", privateKey);
        return ApiClient.getWalletClient(conf).importPrivateKey(body);
    }

    public Call<Float> importPrivateKey(String privateKey, String label)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("privateKey", privateKey);
        body.put("label", label);
        return ApiClient.getWalletClient(conf).importPrivateKey(body);
    }

    public Call<Float> importPrivateKey(String privateKey, String label, boolean rescan)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("privateKey", privateKey);
        body.put("label", label);
        body.put("rescan", rescan);
        return ApiClient.getWalletClient(conf).importPrivateKey(body);
    }

    public Call<HashMap<String, Float>> listAccounts()
    {
        return ApiClient.getWalletClient(conf).listAccounts();
    }

    public Call<HashMap<String, Float>> listAccounts(int minimumAmountOfConfirmations)
    {
        HashMap<String, Integer> body = new HashMap<>();
        body.put("minimumAmountOfConfirmations", minimumAmountOfConfirmations);
        return ApiClient.getWalletClient(conf).listAccounts(body);
    }

    public Call<Object> listAddressGroupings()
    {
        return ApiClient.getWalletClient(conf).listAddressGroupings();
    }

    public Call<Object> listLockUnspent()
    {
        return ApiClient.getWalletClient(conf).listLockUnspent();
    }

    public Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount()
    {
        return ApiClient.getWalletClient(conf).listReceivedByAccount();
    }

    public Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount(int minimumConfirmations)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("minimumConfirmations", minimumConfirmations);
        return ApiClient.getWalletClient(conf).listReceivedByAccount(body);
    }

    public Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount(int minimumConfirmations, boolean includeEmpty)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("minimumConfirmations", minimumConfirmations);
        body.put("includeEmpty", includeEmpty);
        return ApiClient.getWalletClient(conf).listReceivedByAccount(body);
    }

    public Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress()
    {
        return ApiClient.getWalletClient(conf).listReceivedByAddress();
    }

    public Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress(int minimumConfirmations)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("minimumConfirmations", minimumConfirmations);
        return ApiClient.getWalletClient(conf).listReceivedByAddress(body);
    }

    public Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress(int minimumConfirmations, boolean includeEmpty)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("minimumConfirmations", minimumConfirmations);
        body.put("includeEmpty", includeEmpty);
        return ApiClient.getWalletClient(conf).listReceivedByAddress(body);
    }

    public Call<ArrayList<SinceBlockResponse>> listSinceBlock()
    {
        return ApiClient.getWalletClient(conf).listSinceBlock();
    }

    public Call<ArrayList<SinceBlockResponse>> listSinceBlock(String blockhash)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("blockhash", blockhash);
        return ApiClient.getWalletClient(conf).listSinceBlock(body);
    }

    public Call<ArrayList<SinceBlockResponse>> listSinceBlock(String blockhash, int targetConfirmations)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("blockhash", blockhash);
        body.put("targetConfirmations", targetConfirmations);
        return ApiClient.getWalletClient(conf).listSinceBlock(body);
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions()
    {
        return ApiClient.getWalletClient(conf).listTransactions();
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions(String account)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("account", account);
        return ApiClient.getWalletClient(conf).listTransactions(body);
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions(String account, int count)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("account", account);
        body.put("count", count);
        return ApiClient.getWalletClient(conf).listTransactions(body);
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions(String account, int count, int from)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("account", account);
        body.put("count", count);
        body.put("count", from);
        return ApiClient.getWalletClient(conf).listTransactions(body);
    }

    public Call<ArrayList<UnspentResponse>> listUnspent()
    {
        return ApiClient.getWalletClient(conf).listUnspent();
    }

    public Call<ArrayList<UnspentResponse>> listUnspent(int minimumNumberOfConfirmations)
    {
        HashMap<String, Integer> body = new HashMap<>();
        body.put("minimumNumberOfConfirmations", minimumNumberOfConfirmations);
        return ApiClient.getWalletClient(conf).listUnspent(body);
    }

    public Call<ArrayList<UnspentResponse>> listUnspent(int minimumNumberOfConfirmations, int maximumNumberOfConfirmations)
    {
        HashMap<String, Integer> body = new HashMap<>();
        body.put("minimumNumberOfConfirmations", minimumNumberOfConfirmations);
        body.put("maximumNumberOfConfirmations", maximumNumberOfConfirmations);
        return ApiClient.getWalletClient(conf).listUnspent(body);
    }

    public Call<Object> lockWallet()
    {
        return ApiClient.getWalletClient(conf).lockWallet();
    }

    public Call<Float> moveReddcoins(String fromAccount, String toAccount, float amount)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("fromAccount", fromAccount);
        body.put("toAccount", toAccount);
        body.put("amount", amount);
        return ApiClient.getWalletClient(conf).moveReddcoins(body);
    }

    public Call<Float> moveReddcoins(String fromAccount, String toAccount, float amount, int minimumConfirmations)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("fromAccount", fromAccount);
        body.put("toAccount", toAccount);
        body.put("amount", amount);
        body.put("minimumConfirmations", minimumConfirmations);
        return ApiClient.getWalletClient(conf).moveReddcoins(body);
    }

    public Call<Float> moveReddcoins(String fromAccount, String toAccount, float amount, int minimumConfirmations, String comment)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("fromAccount", fromAccount);
        body.put("toAccount", toAccount);
        body.put("amount", amount);
        body.put("minimumConfirmations", minimumConfirmations);
        body.put("comment", comment);
        return ApiClient.getWalletClient(conf).moveReddcoins(body);
    }

    public Call<String> sendReddcoinsFromAccount(String fromAccount, String recipientAddress, float amount, int minimumNumberOfConfirmations, String comment, String toComment)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("fromAccount", fromAccount);
        body.put("recipientAddress", recipientAddress);
        body.put("amount", amount);
        body.put("minimumNumberOfConfirmations", minimumNumberOfConfirmations);
        body.put("comment", comment);
        body.put("toComment", toComment);
        return ApiClient.getWalletClient(conf).sendReddcoinsFromAccount(body);
    }

    public Call<String> sendReddcoinsToAddress(String recipientAddress, float amount)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("recipientAddress", recipientAddress);
        body.put("amount", amount);
        return ApiClient.getWalletClient(conf).sendReddcoinsToAddress(body);
    }

    public Call<String> sendReddcoinsToAddress(String recipientAddress, float amount, String comment)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("recipientAddress", recipientAddress);
        body.put("amount", amount);
        body.put("comment", comment);
        return ApiClient.getWalletClient(conf).sendReddcoinsToAddress(body);
    }

    public Call<String> sendReddcoinsToAddress(String recipientAddress, float amount, String comment, String commentTo)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("recipientAddress", recipientAddress);
        body.put("amount", amount);
        body.put("comment", comment);
        body.put("commentTo", commentTo);
        return ApiClient.getWalletClient(conf).sendReddcoinsToAddress(body);
    }

    public Call<Object> setAccount(String address, String account)
    {
        HashMap<String, String> body = new HashMap<>();
        body.put("address", address);
        body.put("account", account);
        return ApiClient.getWalletClient(conf).setAccount(body);
    }

    public Call<Boolean> setTransactionFee(float amount)
    {
        HashMap<String, Float> body = new HashMap<>();
        body.put("amount", amount);
        return ApiClient.getWalletClient(conf).setTransactionFee(body);
    }

    public Call<Object> unlockWallet(String passphrase, int timeout)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("passphrase", passphrase);
        body.put("timeout", timeout);
        return ApiClient.getWalletClient(conf).unlockWallet(body);
    }

    public Call<Object> unlockWallet(String passphrase, int timeout, boolean stakeonly)
    {
        HashMap<String, Object> body = new HashMap<>();
        body.put("passphrase", passphrase);
        body.put("timeout", timeout);
        body.put("stakeonly", stakeonly);
        return ApiClient.getWalletClient(conf).unlockWallet(body);
    }
}
