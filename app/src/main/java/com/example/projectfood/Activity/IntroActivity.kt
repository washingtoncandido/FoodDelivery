package com.example.projectfood.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.projectfood.R

class IntroActivity : AppCompatActivity() {

  private  lateinit var startBtn:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        startBtn = findViewById(R.id.btn_introducao)
        startBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}