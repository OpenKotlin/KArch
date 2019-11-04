package com.openkotlin.karch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.openkotlin.karch.viewmodels.HomeViewModel as HomeViewModel1

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val apply =
//            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        apply.viewModel.name.
//        setContentView(R.layout.activity_main)
        val homeViewModel = ViewModelProviders.of(this).get(HomeViewModel1::class.java)
        // lifecycle.addObserver(this)
        // TODO : The callback can be ignored in Kotlin
        homeViewModel.mutableLiveData.observe(this, onChanged = {
            it.length
        })
    }
}
