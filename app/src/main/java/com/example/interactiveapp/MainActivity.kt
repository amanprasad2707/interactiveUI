package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.btndark)
        val buttonRead=findViewById<Button>(R.id.btnread)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)



        buttonRead.setOnClickListener{
            // change to light mode
            layout.setBackgroundResource(R.color.yellow)
            Toast.makeText(applicationContext,"switching to read mode..",Toast.LENGTH_SHORT).show()

        }

        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext,"switching to dark mode..",Toast.LENGTH_SHORT).show()

        }


    }
}