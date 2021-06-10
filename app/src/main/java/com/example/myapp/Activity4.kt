package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        var btnPrevious4=findViewById<Button>(R.id.btnPreviuos4)
        var btnNext4=findViewById<Button>(R.id.btnNext4)
        var tvread4=findViewById<TextView>(R.id.tvread4)

        btnNext4.setOnClickListener{
            intent= Intent(baseContext,Activity5::class.java)
            startActivity(intent)
        }
        btnPrevious4.setOnClickListener{
            intent= Intent(baseContext,Activity3::class.java)
            startActivity(intent)
        }

    }
}