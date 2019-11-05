package com.openkotlin.karch.network.api

import com.openkotlin.karch.network.data.BaseResponse
import com.openkotlin.karch.network.data.rsp.LoginRsp
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

/**
 *
 *  Current name : UserApi in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:04.
 *
 *  Note : N/A
 *
 */
interface UserApi {

    companion object {
        const val BASE_URL = "https://github.com"
    }

    @POST("/v1/login")
    suspend fun login(@Body body: RequestBody): BaseResponse<LoginRsp>
}