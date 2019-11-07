package com.openkotlin.karch.network.api

import com.openkotlin.karch.network.data.rsp.GetWeatherRsp
import retrofit2.http.GET

/**
 *
 *  Current name : WeatherApi in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:04.
 *
 *  Note : N/A
 *
 */
interface WeatherApi {

    companion object {
        const val BASE_URL = "http://t.weather.sojson.com/api/"
    }

    @GET("weather/city/101030100")
//    suspend fun getWeatherByCity(): BaseResponse<GetWeatherRsp>
    suspend fun getWeatherByCity(): GetWeatherRsp
}