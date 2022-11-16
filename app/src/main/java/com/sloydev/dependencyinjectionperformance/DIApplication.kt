package com.sloydev.dependencyinjectionperformance

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication

class DIApplication : MultiDexApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}