package com.i.jetpacklivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel: ViewModel() {
    private lateinit var stevilo: MutableLiveData<Int>
    fun vrniStevilo(): MutableLiveData<Int>{
        if(!::stevilo.isInitialized)
            naloziStevilo()
        return stevilo
    }
    fun povecajStevilo(){ stevilo.postValue(stevilo.value!!+ 1) }
    fun zmanjsajStevilo(){ stevilo.postValue(stevilo.value!! - 1) }
    fun naloziStevilo(){ stevilo = MutableLiveData(1) }
}