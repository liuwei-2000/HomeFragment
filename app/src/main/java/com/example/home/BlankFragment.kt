package com.example.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.w3c.dom.Text

class ContentFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate((R.layout.fragment_blank),container,false)
        displayContent(view)
        return view
    }
    private lateinit var viewModel:ViewModel
    private fun displayContent(view:View) {
        val content:TextView = view.findViewById(R.id.content_content)
        val time:TextView = view.findViewById(R.id.content_time)
        val title:TextView = view.findViewById(R.id.content_title)
        viewModel = ViewModelProvider(requireActivity())[ViewModel::class.java]
        viewModel.news.observe(viewLifecycleOwner,Observer{
            content.text = it.content.toString()
            time.text = it.time.toString()
            title.text = it.title.toString()
        })
    }
}
