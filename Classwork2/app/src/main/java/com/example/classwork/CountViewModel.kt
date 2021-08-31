package com.example.classwork

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {

    private var _count = MutableLiveData(0)
    private val count: LiveData<Int> = _count



 fun updateCount(): LiveData<Int> {
     _count.value = _count.value?.plus(1)
     return count
 }

}