package com.openkotlin.karch.network.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.openkotlin.karch.network.data.WeatherRepository

/**
 *
 *  Current name : WeatherViewModel in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:34.
 *
 *  Note : N/A
 *
 */
class WeatherViewModel: BaseViewModel() {



    private val repository by lazy { WeatherRepository() }

    var msg: MutableLiveData<String> = MutableLiveData()

    init {
        updateWeatherToView()
    }

    private fun updateWeatherToView() {
        launchOnIO(
            tryBlock = {
                Log.d("Tanck", "tryBlock Block")
                val serverMsg = repository.getWeather().also {
                    msg.value = it.message
                }
                Log.d("Tanck", "tryBlock Block: $serverMsg")
            },
            catchBlock = {
                e->handlingExceptions(e)
                Log.d("Tanck", "catchBlock Block")
            },
            finallyBlock = {
                Log.d("Tanck", "Finally Block")
            }
        )
    }
}