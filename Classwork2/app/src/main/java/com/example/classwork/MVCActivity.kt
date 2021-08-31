package com.example.classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MVCActivity : AppCompatActivity() {

    lateinit var mvcCount: TextView
    lateinit var button: Button
    private var _count = MutableLiveData(0)
    private val count: LiveData<Int> = _count

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvccount)

        mvcCount = findViewById(R.id.mvc_count)
        button = findViewById(R.id.mvc_button)

        count.observe(this, {
            mvcCount.text = getString(R.string.init_count, it)
        })

        button.setOnClickListener {
            updateCount()
        }
    }

    private fun updateCount() {
        _count.value = _count.value?.plus(1)
    }
}