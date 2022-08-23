package com.example.a611k

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class LanguageActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        initViews()
    }

   private fun initViews(){
        val uzbek = findViewById<Button>(R.id.uzbek)
       uzbek.setOnClickListener{setLocale("uz")}
       val korean = findViewById<Button>(R.id.korean)
       korean.setOnClickListener{setLocale("ko")}
       val japanese = findViewById<Button>(R.id.japanese)
       japanese.setOnClickListener{setLocale("ja")}
       val chinese = findViewById<Button>(R.id.chinese)
       chinese.setOnClickListener{setLocale("zh")}
    }

    private fun setLocale(language: String?){

        val locale = Locale(language)
        Locale.setDefault(locale)

        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)

        finish()

    }
}