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
        return ApiClient.getWalletClient(conf).addMultiSigAddress(new ArrayList<>());
    }

    public Call<Object> backupWallet(String destination)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(destination);
        return ApiClient.getWalletClient(conf).backupWallet(body);
    }

    public Call<Object> changeWalletPasswordPhrase(String oldPassPhrase, String newPassPhrase)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(oldPassPhrase);
        body.add(newPassPhrase);
        return ApiClient.getWalletClient(conf).changeWalletPasswordPhrase(body);
    }

    public Call<String> exportPrivateKey(String address)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(address);
        return ApiClient.getWalletClient(conf).exportPrivateKey(body);
    }

    public Call<String> getAccount(String accountName)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(accountName);
        return ApiClient.getWalletClient(conf).getAccount(body);
    }

    public Call<String> getAccountAddresses(String accountName)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(accountName);
        return ApiClient.getWalletClient(conf).getAccountAddresses(body);
    }

    public Call<Float> getBalance()
    {
        return ApiClient.getWalletClient(conf).getBalance(new ArrayList<>());
    }

    public Call<Float> getBalance(String account)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(account);
        return ApiClient.getWalletClient(conf).getBalance(body);
    }

    public Call<Float> getBalance(String account, int minimumAmountOfConfirmations)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(account);
        body.add(minimumAmountOfConfirmations);
        return ApiClient.getWalletClient(conf).getBalance(body);
    }

    public Call<Float> getInterest()
    {
        return ApiClient.getWalletClient(conf).getInterest(new ArrayList<>());
    }

    public Call<String> getNewAddress()
    {
        return ApiClient.getWalletClient(conf).getNewAddress(new ArrayList<>());
    }

    public Call<String> getNewAddress(String account)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(account);
        return ApiClient.getWalletClient(conf).getNewAddress(body);
    }

    public Call<RawTransactionResponse> getRawTransaction(String transactionId)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(transactionId);
        return ApiClient.getWalletClient(conf).getRawTransaction(body);
    }

    public Call<Float> getReceivedByAccount(String accountName)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(accountName);
        return ApiClient.getWalletClient(conf).getReceivedByAccount(body);
    }

    public Call<Float> getReceivedByAccount(String accountName, int minimumConfirmation)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(accountName);
        body.add(minimumConfirmation);
        return ApiClient.getWalletClient(conf).getReceivedByAccount(body);
    }

    public Call<Float> getReceivedByAddress(String address)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(address);
        return ApiClient.getWalletClient(conf).getReceivedByAddress(body);
    }

    public Call<Float> getReceivedByAddress(String address, int minimumConfirmation)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(address);
        body.add(minimumConfirmation);
        return ApiClient.getWalletClient(conf).getReceivedByAddress(body);
    }

    public Call<StakingInfoResponse> getStakingInfo()
    {
        return ApiClient.getWalletClient(conf).getStakingInfo(new ArrayList<>());
    }

    public Call<TransactionResponse> getTransaction(String transactionId)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(transactionId);
        return ApiClient.getWalletClient(conf).getTransaction(body);
    }

    public Call<Float> getUnconfirmedBalance()
    {
        return ApiClient.getWalletClient(conf).getUnconfirmedBalance(new ArrayList<>());
    }

    public Call<WalletResponse> getWalletInfo()
    {
        return ApiClient.getWalletClient(conf).getWalletInfo(new ArrayList<>());
    }

    public Call<Float> importPrivateKey(String privateKey)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(privateKey);
        return ApiClient.getWalletClient(conf).importPrivateKey(body);
    }

    public Call<Float> importPrivateKey(String privateKey, String label)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(privateKey);
        body.add(label);
        return ApiClient.getWalletClient(conf).importPrivateKey(body);
    }

    public Call<Float> importPrivateKey(String privateKey, String label, boolean rescan)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(privateKey);
        body.add(label);
        body.add(rescan);
        return ApiClient.getWalletClient(conf).importPrivateKey(body);
    }

    public Call<ArrayList<Float>> listAccounts()
    {
        return ApiClient.getWalletClient(conf).listAccounts(new ArrayList<>());
    }

    public Call<ArrayList<Float>> listAccounts(int minimumAmountOfConfirmations)
    {
        ArrayList<Integer> body = new ArrayList<>();
        body.add(minimumAmountOfConfirmations);
        return ApiClient.getWalletClient(conf).listAccounts(body);
    }

    public Call<Object> listAddressGroupings()
    {
        return ApiClient.getWalletClient(conf).listAddressGroupings(new ArrayList<>());
    }

    public Call<Object> listLockUnspent()
    {
        return ApiClient.getWalletClient(conf).listLockUnspent(new ArrayList<>());
    }

    public Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount()
    {
        return ApiClient.getWalletClient(conf).listReceivedByAccount(new ArrayList<>());
    }

    public Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount(int minimumConfirmations)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(minimumConfirmations);
        return ApiClient.getWalletClient(conf).listReceivedByAccount(body);
    }

    public Call<ArrayList<ReceivedByAccountResponse>> listReceivedByAccount(int minimumConfirmations, boolean includeEmpty)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(minimumConfirmations);
        body.add(includeEmpty);
        return ApiClient.getWalletClient(conf).listReceivedByAccount(body);
    }

    public Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress()
    {
        return ApiClient.getWalletClient(conf).listReceivedByAddress(new ArrayList<>());
    }

    public Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress(int minimumConfirmations)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(minimumConfirmations);
        return ApiClient.getWalletClient(conf).listReceivedByAddress(body);
    }

    public Call<ArrayList<ReceivedByAddressResponse>> listReceivedByAddress(int minimumConfirmations, boolean includeEmpty)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(minimumConfirmations);
        body.add(includeEmpty);
        return ApiClient.getWalletClient(conf).listReceivedByAddress(body);
    }

    public Call<ArrayList<SinceBlockResponse>> listSinceBlock()
    {
        return ApiClient.getWalletClient(conf).listSinceBlock(new ArrayList<>());
    }

    public Call<ArrayList<SinceBlockResponse>> listSinceBlock(String blockhash)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(blockhash);
        return ApiClient.getWalletClient(conf).listSinceBlock(body);
    }

    public Call<ArrayList<SinceBlockResponse>> listSinceBlock(String blockhash, int targetConfirmations)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(blockhash);
        body.add(targetConfirmations);
        return ApiClient.getWalletClient(conf).listSinceBlock(body);
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions()
    {
        return ApiClient.getWalletClient(conf).listTransactions(new ArrayList<>());
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions(String account)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(account);
        return ApiClient.getWalletClient(conf).listTransactions(body);
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions(String account, int count)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(account);
        body.add(count);
        return ApiClient.getWalletClient(conf).listTransactions(body);
    }

    public Call<ArrayList<TransactionsResponse>> listTransactions(String account, int count, int from)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(account);
        body.add(count);
        body.add(from);
        return ApiClient.getWalletClient(conf).listTransactions(body);
    }

    public Call<ArrayList<UnspentResponse>> listUnspent()
    {
        return ApiClient.getWalletClient(conf).listUnspent(new ArrayList<>());
    }

    public Call<ArrayList<UnspentResponse>> listUnspent(int minimumNumberOfConfirmations)
    {
        ArrayList<Integer> body = new ArrayList<>();
        body.add(minimumNumberOfConfirmations);
        return ApiClient.getWalletClient(conf).listUnspent(body);
    }

    public Call<ArrayList<UnspentResponse>> listUnspent(int minimumNumberOfConfirmations, int maximumNumberOfConfirmations)
    {
        ArrayList<Integer> body = new ArrayList<>();
        body.add(minimumNumberOfConfirmations);
        body.add(maximumNumberOfConfirmations);
        return ApiClient.getWalletClient(conf).listUnspent(body);
    }

    public Call<Object> lockWallet()
    {
        return ApiClient.getWalletClient(conf).lockWallet(new ArrayList<>());
    }

    public Call<Float> moveReddcoins(String fromAccount, String toAccount, float amount)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(fromAccount);
        body.add(toAccount);
        body.add(amount);
        return ApiClient.getWalletClient(conf).moveReddcoins(body);
    }

    public Call<Float> moveReddcoins(String fromAccount, String toAccount, float amount, int minimumConfirmations)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(fromAccount);
        body.add(toAccount);
        body.add(amount);
        body.add(minimumConfirmations);
        return ApiClient.getWalletClient(conf).moveReddcoins(body);
    }

    public Call<Float> moveReddcoins(String fromAccount, String toAccount, float amount, int minimumConfirmations, String comment)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(fromAccount);
        body.add(toAccount);
        body.add(amount);
        body.add(minimumConfirmations);
        body.add(comment);
        return ApiClient.getWalletClient(conf).moveReddcoins(body);
    }

    public Call<String> sendReddcoinsFromAccount(String fromAccount, String recipientAddress, float amount, int minimumNumberOfConfirmations, String comment, String toComment)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(fromAccount);
        body.add(recipientAddress);
        body.add(amount);
        body.add(minimumNumberOfConfirmations);
        body.add(comment);
        body.add(toComment);
        return ApiClient.getWalletClient(conf).sendReddcoinsFromAccount(body);
    }

    public Call<String> sendReddcoinsToAddress(String recipientAddress, float amount)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(recipientAddress);
        body.add(amount);
        return ApiClient.getWalletClient(conf).sendReddcoinsToAddress(body);
    }

    public Call<String> sendReddcoinsToAddress(String recipientAddress, float amount, String comment)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(recipientAddress);
        body.add(amount);
        body.add(comment);
        return ApiClient.getWalletClient(conf).sendReddcoinsToAddress(body);
    }

    public Call<String> sendReddcoinsToAddress(String recipientAddress, float amount, String comment, String commentTo)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(recipientAddress);
        body.add(amount);
        body.add(comment);
        body.add(commentTo);
        return ApiClient.getWalletClient(conf).sendReddcoinsToAddress(body);
    }

    public Call<Object> setAccount(String address, String account)
    {
        ArrayList<String> body = new ArrayList<>();
        body.add(address);
        body.add(account);
        return ApiClient.getWalletClient(conf).setAccount(body);
    }

    public Call<Boolean> setTransactionFee(float amount)
    {
        ArrayList<Float> body = new ArrayList<>();
        body.add(amount);
        return ApiClient.getWalletClient(conf).setTransactionFee(body);
    }

    public Call<Object> unlockWallet(String passphrase, int timeout)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(passphrase);
        body.add(timeout);
        return ApiClient.getWalletClient(conf).unlockWallet(body);
    }

    public Call<Object> unlockWallet(String passphrase, int timeout, boolean stakeonly)
    {
        ArrayList<Object> body = new ArrayList<>();
        body.add(passphrase);
        body.add(timeout);
        body.add(stakeonly);
        return ApiClient.getWalletClient(conf).unlockWallet(body);
    }
}
