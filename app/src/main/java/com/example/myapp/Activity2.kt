package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapp.R.id.btnNext2

abstract class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

       var btnPrevious=findViewById<Button>(R.id.btnPrevious)
       var btnNext2=findViewById<Button>(btnNext2)
        var tv1=findViewById<TextView>(R.id.tv1)

        btnNext2.setOnClickListener{
            var intent = Intent(baseContext,Activity3::class.java)
            startActivity(intent)
        }
        btnPrevious.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }



    }}