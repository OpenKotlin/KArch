package com.openkotlin.karch.network.api

import com.openkotlin.karch.network.BaseRetrofitClient

/**
 *
 *  Current name : BaseApi in `KArch`
 *
 *  Created by Tanck on 2019-11-07 15:25.
 *
 *  Note : N/A
 *
 */
abstract interface BaseApi {
    companion object {
        const val BASE_URL = "http://t.weather.sojson.com/api/"


        object DefaultRetrofitClient : BaseRetrofitClient() {
        }


//        object basere : BaseRetrofitClient() {
//            val WeatherApiService by lazy {
//                WeatherApi.Companion.WeatherRetrofitClient.getAPIService(
//                    WeatherApi::class.java,
//                    BASE_URL
//                )
//            }
//        }

        // Operator is the constructor options. The same as the implement in java
//        operator fun invoke(): WeatherApi {
//            return T
//        }
    }

//    object WeatherRetrofitClient : BaseRetrofitClient() {
//        val WeatherApiService by lazy { getAPIService(getClassType(), BASE_URL) }
//    }

    abstract fun <APIService> getClassType(): Class<APIService>

    open fun <APIService> myMethod () {

        val serviceClass: Class<APIService> = getClassType()

    }

    abstract suspend fun getCurrentService()
}