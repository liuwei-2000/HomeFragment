package com.example.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var news = MutableLiveData<News>()
}