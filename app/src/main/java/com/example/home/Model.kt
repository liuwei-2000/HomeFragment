package com.example.home

import com.google.gson.Gson


object Test{

    val str =""
    var articleList = Gson().fromJson(str, ArticleList::class.java)
    fun link():String{
        return articleList.data.datas[0].link
    }
    fun title():String{
        return articleList.data.datas[0].title
    }
    fun collect():Boolean{
        return articleList.data.datas[0].collect
    }
    fun date():String{
        return articleList.data.datas[0].niceDate
    }
}

data class ArticleList(var data: Data)

data class Data(var curPage: Int, var datas: MutableList<ArticleItem>)

data class ArticleItem(var title: String, var link: String,var collect: Boolean, var niceDate:String)