package com.openkotlin.karch.network.data

/**
 *
 *  Current name : BaseResponse in `KArch`
 *
 *  Created by Tanck on 2019-11-05 14:53.
 *
 *  Note : The response of base which is defined on backend
 *
 */
data class BaseResponse<out T>(val data: T?)