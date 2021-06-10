package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnNext=findViewById<Button>(R.id.btnNext)
        var tvread=findViewById<TextView>(R.id.tvread)

        btnNext.setOnClickListener{
            var intent= Intent(baseContext,Activity2::class.java)
            startActivity(intent)

        }



    }
}