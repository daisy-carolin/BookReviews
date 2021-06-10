package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        var  btnPrevious5=findViewById<Button>(R.id.btnPrevious5)
        var  tvread5=findViewById<TextView>(R.id.tvread5)


      btnPrevious5.setOnClickListener{
          var intent=Intent(baseContext,Activity4::class.java)
          
      }






    }
}