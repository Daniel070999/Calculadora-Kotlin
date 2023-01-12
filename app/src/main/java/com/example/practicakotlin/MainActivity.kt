package com.example.practicakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var data = ""
        val btn1 = findViewById<Button>(R.id.btn1) as Button
        val btn2 = findViewById<Button>(R.id.btn2) as Button
        val btn3 = findViewById<Button>(R.id.btn3) as Button
        val txtviewOperation = findViewById<Button>(R.id.txtviewOperation) as TextView

        btn1.setOnClickListener {
            data += "1"
            txtviewOperation.text = data
        }
        btn2.setOnClickListener {
            data += "2"
            txtviewOperation.text = data
        }
        btn3.setOnClickListener {
            data += "3"
            txtviewOperation.text = data
        }
    }
}