package com.example.practice_2_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val provider = ViewModelProvider(this)
        viewModel = provider.get(MainViewModel::class.java)
        observeViewModel()
        initView()
        var hehcopy = heh()
        hehcopy.f(MainViewModel)
    }

    fun observeViewModel() {
        viewModel.counter.observe(this, Observer {

            val rndNum : EditText = findViewById(R.id.rndNum)
            rndNum.setText("-")
            rndNum.setText(it.toString())
        })
    }

    fun initView() {
        val getRnd : Button = findViewById(R.id.getRnd)
            getRnd.setOnClickListener {
            viewModel.onRandomClicked()
        }
    }

}