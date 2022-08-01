package com.example.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeiViewModel: ViewModel() {
    var news = MutableLiveData<ArticleItem>()
}