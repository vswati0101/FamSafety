package com.example.famsafety

import android.app.Application

class FamSafetyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Sharedpref.init(this)
    }
}