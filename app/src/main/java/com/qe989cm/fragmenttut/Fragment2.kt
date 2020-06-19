package com.qe989cm.fragmenttut

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2_layout.view.receivedName_TV

class Fragment2 : Fragment() {

    var receivedName: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment2_layout, container, false)

        arguments?.let { receivedName = it.getString("NAME") }
        Log.d("Fragment2", "Arguments: ${arguments.toString()}")
        rootView.receivedName_TV.text = receivedName

        return rootView
    }
}