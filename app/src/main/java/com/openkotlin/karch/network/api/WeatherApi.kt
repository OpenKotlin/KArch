package com.openkotlin.karch.network.api

import com.openkotlin.karch.network.BaseRetrofitClient
import com.openkotlin.karch.network.api.WeatherApi.Companion.WeatherRetrofitClient.WeatherApiService
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
interface WeatherApi{

    @GET("weather/city/101030100")
//    suspend fun getWeatherByCity(): BaseResponse<GetWeatherRsp>
    suspend fun getWeatherByCity(): GetWeatherRsp

    companion object {

        // 1. Config the custom host url
        const val BASE_URL = "http://t.weather.sojson.com/api/"

        // 2. Generate the request client. TODO : The client should be as a single instance - Tanck
        // TODO : Looking into how to abstract in Kotlin
        object WeatherRetrofitClient : BaseRetrofitClient() {
            val WeatherApiService by lazy { getAPIService(WeatherApi::class.java, BASE_URL) }
        }

        // Operator is the constructor options. The same as the implement in java
        operator fun invoke(): WeatherApi {
            return WeatherApiService
        }
    }

//    override suspend fun getCurrentService() {
//        BaseApi.Companion.BaseRetrofitClient.baseApiService.getWeatherByCity()
//    }
}