Reddcoin-Java-Core-API

A Reddcoin Java Core RPC API

Feel free to support me with some Reddcoins RDD: Ri7NauXZ26dn6adcGeERb8XpH7yNfu36bz

Import the jar file out/artifacts/Reddcoin_Java_Core_API_jar/Reddcoin-Java-Core-API.jar
into your java project as a library to have a ready to use API including all dependencies

If you want to work from the source, the dependencies are the following :

- retrofit >= 2.3
- okio >= 1.11
- okhttp >= 3.8
- moshi >= 1.4
- converter-moshi >= 2.3
- jsonrpc >= 1.0

Usage example :

```java
Configuration conf = new Configuration("url", "username", "password", "", 0); // passphrase and timeout not yet implemented
Blockchain blockchain = new Blockchain(conf);
Call<String> = blockchain.getBlockHash(12345); // return a retrofit Call object, use it async or synchro as you wish
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
