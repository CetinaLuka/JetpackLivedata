package com.i.jetpacklivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this)[DataViewModel::class.java]
        viewModel.vrniStevilo().observe(this, Observer {stevilo ->
            steviloTextView.text = stevilo.toString()
        })
        povecajSteviloButton.setOnClickListener { viewModel.povecajStevilo() }
        zmanjsajSteviloButton.setOnClickListener { viewModel.zmanjsajStevilo() }
    }
}