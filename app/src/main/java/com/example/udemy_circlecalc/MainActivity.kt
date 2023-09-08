package com.example.udemy_circlecalc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.udemy_circlecalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calcViewModel: CalcViewModel
    lateinit var calcViewModelFactory: CalcViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        calcViewModelFactory = CalcViewModelFactory(MyCalc())
        calcViewModel = ViewModelProvider(this, calcViewModelFactory).get(CalcViewModel::class.java)

        binding.calcViewModel = calcViewModel
        binding.lifecycleOwner = this
    }
}