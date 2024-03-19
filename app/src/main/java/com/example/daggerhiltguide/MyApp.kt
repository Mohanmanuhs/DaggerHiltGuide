package com.example.daggerhiltguide

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//it necessary when we need the application context to be injected to required class, dagger hilt will automatically take cares of this.
//we have to add    android:name=".MyApp"  in manifest inside application
@HiltAndroidApp
class MyApp:Application()