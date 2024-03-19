package com.example.daggerhiltguide.data.repository

import com.example.daggerhiltguide.data.remote.MyApi
import com.example.daggerhiltguide.domain.repository.MyRepository

class MyRepositoryImpl(
    //in order to inject the dependency here we need to create a provides fun which provides MyApi as return type
    //no need to use inject annotation to inject the dependency to normal class

    //use application context in this way @ApplicationContext appContext:Context or private val appContext:Application
    private val api:MyApi
):MyRepository {
    override suspend fun doNetworkCall()
    {


    }
}