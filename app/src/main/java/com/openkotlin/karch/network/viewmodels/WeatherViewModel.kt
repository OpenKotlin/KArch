package com.openkotlin.karch.network.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.openkotlin.karch.network.data.WeatherRepository
import kotlinx.android.synthetic.main.activity_main.*

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
//                    msg.observe(this@MainActivity) {
//                        Log.d(TAG, "The data has been changed : $it")
//                        tv_value.text = it
//                    }
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