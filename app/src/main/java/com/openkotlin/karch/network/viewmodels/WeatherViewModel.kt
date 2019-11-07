package com.openkotlin.karch.network.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.openkotlin.karch.network.data.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 *
 *  Current name : WeatherViewModel in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:34.
 *
 *  Note : N/A
 *
 */
class WeatherViewModel : BaseViewModel() {


    private val repository by lazy { WeatherRepository() }

    var msg: MutableLiveData<String> = MutableLiveData()

    init {
        updateWeatherToView()
    }

    private fun updateWeatherToView() {
        launchOnMain(
            tryBlock = {
                Log.d("Tanck", "tryBlock Block")
//                val serverMsg = repository.getWeather().also {
                // TODO : This block working on the UI thread.
                /**
                 * Sets the value. If there are active observers, the value will be dispatched to them.
                 * <p>
                 * This method must be called from the main thread. If you need set a value from a background
                 * thread, you can use {@link #postValue(Object)}
                 *
                 * @param value The new value
                 */
//                    @MainThread
//                    protected void setValue(T value) {
//                        assertMainThread("setValue");
//                        mVersion++;
//                        mData = value;
//                        dispatchingValue(null);
//                    }
//                    // Switch to MAIN thread when the data backed
//                    withContext(Dispatchers.Main) { msg.value = it.message }
//                }
                // 1. Try with server to get data
                val serverMsg = repository.getWeather()
                // 2. Update the data to live data
                msg.value = serverMsg.message
                Log.d("Tanck", "tryBlock Block: $serverMsg")
            },
            catchBlock = { e ->
                handlingExceptions(e)
                Log.d("Tanck", "catchBlock Block")
            },
            finallyBlock = {
                Log.d("Tanck", "Finally Block")
            }
        )
    }
}