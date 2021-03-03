package com.example.fragmentostransaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.frag1_bSiguiente).setOnClickListener {
            val fragmentCargar=(activity as MainActivity).supportFragmentManager.findFragmentByTag("second")
            if (fragmentCargar==null)
                (activity as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_flFragments, SecondFragment(),"second").addToBackStack(null).commit()
            else
                (activity as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_flFragments, fragmentCargar,"second").commit()
        }
    }

}