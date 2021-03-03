package com.example.fragmentostransaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.frag2_bVolver).setOnClickListener {
            val fragmentCargar=(activity as MainActivity).supportFragmentManager.findFragmentByTag("first")
            fragmentCargar?.let{(activity as MainActivity).supportFragmentManager.beginTransaction().add(R.id.main_flFragments,it).commit()}
        }
    }
}