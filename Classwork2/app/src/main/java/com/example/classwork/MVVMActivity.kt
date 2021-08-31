package com.example.classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MVVMActivity : AppCompatActivity() {
    lateinit var tvCount: TextView
    lateinit var button: Button
    lateinit var vModel: CountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCount = findViewById(R.id.tv_count)
        button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            observeCount()
        }
    }

    private fun observeCount() {
        vModel = ViewModelProvider(this).get(CountViewModel::class.java)
        vModel.updateCount().observe(this, {
            tvCount.text = getString(R.string.init_count, it)
        })
    }
}