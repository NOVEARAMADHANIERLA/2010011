package com.example.a2010011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a2010011.databinding.ActivityAksesBinding
import com.example.a2010011.databinding.ActivityMainBinding

class AksesActivity : AppCompatActivity() {
    lateinit var binding: ActivityAksesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAksesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsubmit.setOnClickListener{
            Toast.makeText( this,"Ini Menggunakan Binding Pak", Toast.LENGTH_LONG).show()
        }
    }
}