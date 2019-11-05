package com.openkotlin.karch.network.data.client

import com.openkotlin.karch.network.BaseRetrofitClient
import com.openkotlin.karch.network.api.WeatherApi

/**
 *
 *  Current name : WeatherRetrofitClient in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:32.
 *
 *  Note : N/A
 *
 */
object WeatherRetrofitClient: BaseRetrofitClient() {
    val service by lazy { getAPIService(WeatherApi::class.java, WeatherApi.BASE_URL) }
}