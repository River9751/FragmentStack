package com.example.river.fragmentstack

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*


class F1 : Fragment() {

    var name = ""

    init {
        name = "F${Global.count}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("*** $name onCreate")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        println("*** $name onAttach")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        println("*** $name onCreateView")
        val v = LayoutInflater.from(activity).inflate(R.layout.fragment_main, null)
        v.textView.text = this.name
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("*** $name onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        println("*** $name onStart")
    }

    override fun onResume() {
        super.onResume()
        println("*** $name onResume")
    }

    override fun onPause() {
        super.onPause()
        println("*** $name onPause")
    }

    override fun onStop() {
        super.onStop()
        println("*** $name onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("*** $name onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("*** $name onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("*** $name onDetach")
    }
}