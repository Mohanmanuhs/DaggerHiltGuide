package com.example.daggerhiltguide

import androidx.lifecycle.ViewModel
import com.example.daggerhiltguide.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//to inject to viewModels annotate with hiltViewmodel and use inject and constructor
@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository):ViewModel()


//using lazy the dependency will be injected when we use it, util it wont inject
//@HiltViewModel
//class MyViewModel @Inject constructor(private val repository: Lazy<MyRepository>):ViewModel() {
//
//
//    init {
//        repository.get()  // to get the MyRepository
//    }
//}