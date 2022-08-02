package com.example.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var news = MutableLiveData<ArticleItem>()
    fun getDatas():List<ArticleItem> {
        var articleList:MutableList<ArticleItem> = Test.articleList.data.datas
        return articleList
    }
}