package com.example.a611k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(){
        button = findViewById(R.id.entryButton)
        button.setOnClickListener(View.OnClickListener { callLanguageAct()  })
    }

    fun callLanguageAct(){
        val intent = Intent(this, LanguageActivity::class.java)
        startActivity(intent)
    }
}