package com.example.daggerhiltguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.daggerhiltguide.ui.theme.DaggerHiltGuideTheme
import dagger.hilt.android.AndroidEntryPoint

//it should be used in every android component like service , MainActivity , fragment
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    //we are injecting the name to Person class to initialize the person variable
    val person=Person(name="John")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltGuideTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}
//Person class depended on name variable
class Person(val name: String)

//in order to do this automatically we use dependency injection (dagger hilt , Koin etc)
