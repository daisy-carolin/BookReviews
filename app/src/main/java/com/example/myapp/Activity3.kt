package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        var btnPreviuos3=findViewById<Button>(R.id.btnPrevious3)
        var btnNext3=findViewById<Button>(R.id.btnNext3)
        var tvread3=findViewById<TextView>(R.id.tvread3)

        btnNext3.setOnClickListener{
            intent=Intent(baseContext,Activity4::class.java)
            startActivity(intent)
        }
        btnPreviuos3.setOnClickListener{
            intent = Intent(baseContext,Activity2::class.java)
            startActivity(intent)
        }

} }