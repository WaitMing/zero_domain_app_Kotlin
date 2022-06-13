package com.example.myapplication.logUtils
import android.util.Log
import com.example.myapplication.config.BaseConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

//  日志收集
object LogCollect {

    fun handlerError(function : () -> Unit){
        try{
            function()
        } catch (error : Exception) {

            if(!BaseConfig.debugMode){

            }

        }
    }

    //  识别当前 Activity | Service | BroadCast
    fun debugLog(currentTag : String,log : String){
        if(BaseConfig.debugMode){
            Log.d(currentTag,log)
        }
    }

    //  上传日志
    suspend fun postLog(){
        withContext(Dispatchers.IO){

        }
    }
}