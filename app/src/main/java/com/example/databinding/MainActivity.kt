package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p = Person( "Ali", "ABC@gmail.com", "1234", "20 Jalan")

            binding.personDetail = p
        }
        binding.button2.setOnClickListener(){

            var p = Person( "Alu", "ABCewewe@gmail.com", "12123214", "20 dwdwdJalan")

            binding.personDetail = p


        }


        }
    }
