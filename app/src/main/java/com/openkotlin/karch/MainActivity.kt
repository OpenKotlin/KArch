package com.openkotlin.karch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.openkotlin.karch.databinding.ActivityMainBinding
import com.openkotlin.karch.network.viewmodels.WeatherViewModel

class MainActivity : AppCompatActivity() {

    private val TAG: String = MainActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
                .apply {
                    viewModel =
                        ViewModelProviders.of(this@MainActivity).get(WeatherViewModel::class.java)
                }

        activityMainBinding.viewModel?.getWeather()
        // TODO : The callback can be ignored in Kotlin
//        viewModel.mutableLiveData.observe(this, onChanged = {
//
//        })
//        activityMainBinding.viewModel?.mutableLiveData?.observe(this) {
//            Log.d(TAG, it)
//            //activityMainBinding.viewModel?.name = "Dynamic String form the observe"
//        }

    }


}
