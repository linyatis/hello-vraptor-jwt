#How to work with JWT and VRaptor

This is a "Hello World" project to guide you how to integrate a JWT token based authentication and VRaptor Framework.


##How to test
To test it you can use any resource to send requests with an authorization header.

The simplest way to test it is using curl, as below:
```
curl --header "Authorization:YOUR_TOKEN_HERE" http://localhost:8080/hello-vraptor-jwt/customers
```

Replace `YOUR_TOKEN_HERE` with your token.

###Examples of Tokens
| Description                      | Token                                                                                                                                        |
|----------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| Valid                            | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjIzODUzMTc4MzQsImlhdCI6MTQzOTIzNzgzNCwidXNlciI6MX0.fN75EaS5yyFtxZTUr-qvjtDH-Ku7TIfybWsdmdTk7Q0 |
| Expired                          | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0MzkyMzY0NjQsImlhdCI6MTQzOTIzNjQ2MywidXNlciI6MX0.9JGmBtLTuYMX5STDeBgeOs3FbupgVUpCrfjmvbF_ho8 |
| Not expired, user not recognized | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjIzODUzMTc1NjEsImlhdCI6MTQzOTIzNzU2MSwidXNlciI6Mn0.sCdY8nirKT2NwCzKx4xPuezZWyT64zT4NTV8z39ZbE0 |
