package com.openkotlin.karch.network.data

import com.openkotlin.karch.network.data.client.WeatherRetrofitClient

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

    suspend fun getWeather() = WeatherRetrofitClient.service.getWeatherByCity()

}