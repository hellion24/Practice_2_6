package com.example.practice_2_6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

object MainViewModel : ViewModel() {

    var counter = MutableLiveData<Int>()

    fun onRandomClicked() {
        counter.value = Random.nextInt(0, 50)
    }
   
}


