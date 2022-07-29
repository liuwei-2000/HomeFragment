package com.example.home

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var data = mutableListOf<News>()
    fun addData(news:News) =data.add(news)
    private var onItemClick: ((News)->Unit)?=null
//    private var onLikeClick: ((Boolean)->Unit)?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent ,false)
        return  object :RecyclerView.ViewHolder(view){}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val news = data[position]
        val like:Boolean = false
        holder.itemView.findViewById<TextView>(R.id.item_content).text = data[position].content
        holder.itemView.findViewById<TextView>(R.id.item_title).text = data[position].title
        holder.itemView.findViewById<TextView>(R.id.item_time).text = data[position].time
        holder.itemView.findViewById<TextView>(R.id.item_like).text = "收藏"
        holder.itemView.findViewById<TextView>(R.id.item_like).setOnClickListener {
            var textView = (it as TextView)
            if (textView.text == "已收藏")
                textView.text = "收藏"
            else
                textView.text = "已收藏"
        }

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(news)
            Log.d("liyu", "on Item click")
            it.findViewById<TextView>(R.id.item_like).setOnClickListener{

            }
        }
//        holder.itemView.setOnClickListener{
//            onLikeClick?.invoke(like)
//        }
    }
    override fun getItemCount(): Int = data.size
    fun setOnItemClickListener(listener:(News)->Unit){
        onItemClick = listener
    }
//    fun setOnLikeClickListener(listener:(Boolean)->Unit){
//        onLikeClick = listener
//    }


}