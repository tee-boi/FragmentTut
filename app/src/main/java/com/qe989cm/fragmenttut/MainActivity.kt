package com.qe989cm.fragmenttut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), SendData {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment1())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit()
    }

    override fun sendData(name: String) {
        Fragment2().apply {
            arguments = Bundle().apply {
                putString("NAME", name)
            }
            Log.d("Fragment1", "Sending: ${arguments.toString()}")
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment2())
            .addToBackStack("Fragment2").setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit()

    }


}