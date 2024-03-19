package com.example.daggerhiltguide.di

import com.example.daggerhiltguide.data.repository.MyRepositoryImpl
import com.example.daggerhiltguide.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(myRepositoryImpl:MyRepositoryImpl):MyRepository

    //we have to add @Inject and constructor to MyRepositoryImpl and no need of provide fun

}