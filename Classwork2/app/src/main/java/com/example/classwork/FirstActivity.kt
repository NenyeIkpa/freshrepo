package com.example.classwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {

    lateinit var mvcButton: Button
    lateinit var mvvmButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        mvcButton = findViewById(R.id.mvc_button)
        mvvmButton = findViewById(R.id.mvvm_button)

        mvcButton.setOnClickListener {
            getMVCActivity()
        }
        mvvmButton.setOnClickListener {
            getMVVMActivity()
        }
    }

    fun getMVCActivity() {
        val intent = Intent(this, MVCActivity::class.java)
        startActivity(intent)
    }

    fun getMVVMActivity() {
        val intent = Intent(this, MVVMActivity::class.java)
        startActivity(intent)
    }
}