A Reddcoin Java Core RPC API

Feel free to support me with some Reddcoins RDD: Ri7NauXZ26dn6adcGeERb8XpH7yNfu36bz

Import the jar file out/artifacts/Reddcoin_Java_Core_API_jar/Reddcoin-Java-Core-API.jar
into your java project as a library to have a ready to use API including all dependencies

If you want to work from the source, the dependencies are the following (available in the lib folder):

- retrofit >= 2.3
- okio >= 1.11
- okhttp >= 3.8
- moshi >= 1.4
- converter-moshi >= 2.3

Usage example :

```java
Configuration conf = new Configuration("url", "username", "password");
Wallet wallet = new Wallet(conf);
Call<String> call = wallet.getNewAddress("myNewAddressAcountLabel");

// use the call object either in blocking synchro way
Response res = call.execute();
if(res.code() == 200)
 System.out.println(res.body());
else System.out.println(res.errorBody());

// or in non blocking async way (usefull for android)
call.enqueue(new retrofit2.Callback<String>() {
    @Override
    public void onResponse(Call<String> call, retrofit2.Response<String> response) {
     if(response.isSuccessful())
      System.out.println(response.body());
     else
      System.out.println(response.errorBody());
    }

    @Override
    public void onFailure(Call<String> call, Throwable throwable) {
     throwable.printStackTrace();
    }
});
```

The following API object are available in com.reddcoin.core.API :

 - Blockchain
 - Environment
 - Mining
 - Network
 - Utilities
 - Wallet
 
 They all take a Configuration object to construct, and exposes the differents possible endpoints with explicit parameters.
 
 For more information on what is returned, the original API that was used to make this port is available here :
 https://github.com/Surfer058/Reddcoin-.NET-Core-API
