package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val countLiveData = MutableLiveData<Int>()

    init {
        countLiveData.value = 0
    }

    fun getcountLiveData() : LiveData<Int>{
        return countLiveData
    }

    fun increment(){
        countLiveData.value = countLiveData.value!! + 1
    }

    fun decrement(){
        countLiveData.value = countLiveData.value!! - 1
    }

    fun reset(){
        countLiveData.value = 0
    }
}