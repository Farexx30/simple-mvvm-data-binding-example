package com.example.simplemvvmdatabindingexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private val _number = MutableLiveData(0)
    var number: LiveData<Int> = _number

    fun increaseNumber() {
        _number.value = _number.value?.plus(1)
    }

    fun decreaseNumber() {
        _number.value = _number.value?.minus(1)
    }
}