package com.qe989cm.fragmenttut

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1_layout.view.*

class Fragment1 : Fragment() {

    private lateinit var communicator: SendData

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment1_layout, container, false)
        communicator = activity as SendData

        rootView.btn_send.setOnClickListener {
            communicator.sendData(rootView.name_ET.text.toString())
        }

        return rootView
    }
}
