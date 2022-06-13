package com.example.myapplication.config

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.logUtils.LogCollect

open class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogCollect.debugLog("onCreate",javaClass.simpleName)
    }

    override fun onStart() {
        super.onStart()
        LogCollect.debugLog("onStart",javaClass.simpleName)
    }

    override fun onResume() {
        super.onResume()
        LogCollect.debugLog("onResume",javaClass.simpleName)
    }

    override fun onRestart() {
        super.onRestart()
        LogCollect.debugLog("onRestart",javaClass.simpleName)
    }

    override fun onPause() {
        super.onPause()
        LogCollect.debugLog("onPause",javaClass.simpleName)
    }

    override fun onStop() {
        super.onStop()
        LogCollect.debugLog("onStop",javaClass.simpleName)
    }

    override fun onDestroy() {
        super.onDestroy()
        LogCollect.debugLog("onDestroy",javaClass.simpleName)
    }
}