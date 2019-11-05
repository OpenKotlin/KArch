package com.openkotlin.karch.network.viewmodels

import android.util.Log
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


    fun getWeather() {
        launchOnIO(
            tryBlock = {
                Log.d("Tanck", "tryBlock Block")
                Log.d("Tanck", "tryBlock Block" + repository.getWeather().toString())



//                    .run {
//                    Log.d("Tanck", this.toString())
//                }
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