package com.openkotlin.karch

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.openkotlin.karch.databinding.ActivityMainBinding
import com.openkotlin.karch.viewmodels.HomeViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val apply =
        val activityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
                .apply {
                    viewModel = ViewModelProviders.of(this@MainActivity).get(HomeViewModel::class.java)
                }
//        apply.viewModel.name.




        activityMainBinding.viewModel!!.mutableLiveData.observe(this) {
            Log.d("Tanck", it)
        }
        // lifecycle.addObserver(this)
        // TODO : The callback can be ignored in Kotlin
//        viewModel.mutableLiveData.observe(this, onChanged = {
//
//        })
    }
}
