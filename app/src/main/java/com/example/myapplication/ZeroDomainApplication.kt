package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class ZeroDomainApplication : Application() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        private var context : Context? = null
    }

    fun getContext() : Context? {
        return context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        //  日志

        //  内存检测

    }


}