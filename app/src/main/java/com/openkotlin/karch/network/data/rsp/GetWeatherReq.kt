package com.openkotlin.karch.network.data.rsp


/**
 *
 *  Current name : GetWeatherReq in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:12.
 *
 *  Note : N/A
 *
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
//data class GetWeatherReq(@JsonProperty("status") val status: String, @JsonProperty("message") val message: String)
data class GetWeatherReq(val status: String, val message: String)