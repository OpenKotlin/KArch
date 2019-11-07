package com.openkotlin.karch.network.data

import com.openkotlin.karch.network.BaseRetrofitClient
import com.openkotlin.karch.network.api.WeatherApi

/**
 *
 *  Current name : WeatherRepository in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:31.
 *
 *  Note : N/A
 *
 */
class WeatherRepository {

    object WeatherRetrofitClient: BaseRetrofitClient() {
        val service by lazy { getAPIService(WeatherApi::class.java, WeatherApi.BASE_URL) }
    }

    suspend fun getWeather() = WeatherRetrofitClient.service.getWeatherByCity()

}