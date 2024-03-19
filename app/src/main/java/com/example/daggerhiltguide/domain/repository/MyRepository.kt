package com.example.daggerhiltguide.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()

}