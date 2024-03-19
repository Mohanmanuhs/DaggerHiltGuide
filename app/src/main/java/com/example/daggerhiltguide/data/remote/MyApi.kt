package com.example.daggerhiltguide.data.remote

import retrofit2.http.GET

interface MyApi {
    //api interface should be in data -> remote
    //it is just a get request
    @GET("test")
    suspend fun doNetworkCall()
}