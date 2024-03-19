package com.example.daggerhiltguide.di

import com.example.daggerhiltguide.data.remote.MyApi
import com.example.daggerhiltguide.data.repository.MyRepositoryImpl
import com.example.daggerhiltguide.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


//Modules should be in di(dependency injection)
//Modules is collection of provides fun which provide dependency to required classes
//installIn tells how long the dependencies we provide in the module will actually live
//ActivityComponent -> dependencies will live only as long as the activity live
//ViewModelComponent -> dependencies will live only as long as the viewModel
//RetainedComponent -> helps to retains components when screen is rotated or activity is recreated
//ServiceComponent -> dependencies will live only as long as the service
//SingletonComponent -> dependencies will live only as long as the app
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //here singleton is single instance of MyApi in whole lifetime of our application
    //if we wont annotate with singleton if 2 class need this dependency then 2 will get different instance

    @Provides
    @Singleton
    fun providesMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("http://test.com")
            .build().create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun providesMyRepository(myApi:MyApi /*, @Named("hello1") hello1:String*/):MyRepository{
        return MyRepositoryImpl(myApi)
    }
    // here we want to provide MyRepository interface but we are returning its implementation so to get out of this we use abstraction(RepositoryModule
    // this provides fun not required if we are using abstraction method with binds
    //we need to add inject and constructor to MyRepositoryImpl while using this method



    //if 2 dependencies fun has same return type then we can use named annotation and to use, @Named("hello1") hello1:String
    @Provides
    @Singleton
    @Named("hello1")
    fun hello1()="hello1"

    @Provides
    @Singleton
    @Named("hello2")
    fun hello2()="hello2"

}