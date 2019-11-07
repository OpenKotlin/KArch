package com.openkotlin.karch

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.openkotlin.karch.network.viewmodels.WeatherViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG: String = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewModelProviders.of(this@MainActivity).get(WeatherViewModel::class.java).apply {
            msg.observe(this@MainActivity) {
                Log.d(TAG, "The data has been changed : $it")
                tv_value.text = it
            }
        }

        tv_value.setTextColor(resources.getColor(R.color.colorAccent))

//        val activityMainBinding =
//            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//                .apply {
//                    viewModel =
//                        ViewModelProviders.of(this@MainActivity).get(WeatherViewModel::class.java)
//                }

//        activityMainBinding.viewModel?.updateWeatherToView()
        // TODO : The callback can be ignored in Kotlin
//        viewModel.mutableLiveData.observe(this, onChanged = {
//
//        })
//        activityMainBinding.viewModel?.msg?.observe(this) {
//
//        }

    }

}
