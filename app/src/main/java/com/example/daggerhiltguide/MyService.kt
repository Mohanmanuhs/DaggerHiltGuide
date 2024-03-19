package com.example.daggerhiltguide

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhiltguide.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService :Service(){
    //we cant use constructor inject to inject the dependencies in service so we use field inject

    @Inject
    lateinit var repository: MyRepository

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }



}