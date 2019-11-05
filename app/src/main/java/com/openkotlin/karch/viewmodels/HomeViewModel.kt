package com.openkotlin.karch.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel() : ViewModel() {
    var name = "HomeName"
    val mutableLiveData = MutableLiveData<String>("Tanck")
}