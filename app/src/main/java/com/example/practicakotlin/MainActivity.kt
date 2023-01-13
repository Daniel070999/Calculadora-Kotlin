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
        var data1 = ""
        var data2 = ""
        val btn1 = findViewById<Button>(R.id.btn1) as Button
        val btn2 = findViewById<Button>(R.id.btn2) as Button
        val btn3 = findViewById<Button>(R.id.btn3) as Button
        val btn4 = findViewById<Button>(R.id.btn4) as Button
        val btn5 = findViewById<Button>(R.id.btn5) as Button
        val btn6 = findViewById<Button>(R.id.btn6) as Button
        val btn7 = findViewById<Button>(R.id.btn7) as Button
        val btn8 = findViewById<Button>(R.id.btn8) as Button
        val btn9 = findViewById<Button>(R.id.btn9) as Button
        val btn0 = findViewById<Button>(R.id.btn0) as Button

        val btnsuma = findViewById<Button>(R.id.btnsuma) as Button
        val btnresta = findViewById<Button>(R.id.btnresta) as Button
        val btnmultiplicacion = findViewById<Button>(R.id.btnmultiplicacion) as Button
        val btndivision = findViewById<Button>(R.id.btndivision) as Button

        val btnlimpiar = findViewById<Button>(R.id.btnlimpiar) as Button
        val btnigual = findViewById<Button>(R.id.btnigual) as Button

        val txtviewOperation1 = findViewById<Button>(R.id.txtviewOperation1) as TextView
        val txtviewOperation = findViewById<Button>(R.id.txtviewOperation) as TextView
        val txtviewOperation2 = findViewById<Button>(R.id.txtviewOperation2) as TextView

        btnigual.setOnClickListener {

        }

        btnlimpiar.setOnClickListener {
            txtviewOperation1.text = "--"
            txtviewOperation.text = "--"
            txtviewOperation2.text = "--"
            data1 = ""
            data2 = ""
        }

        btnsuma.setOnClickListener {
            txtviewOperation.text = btnsuma.text
        }
        btnresta.setOnClickListener {
            txtviewOperation.text = btnresta.text
        }
        btnmultiplicacion.setOnClickListener {
            txtviewOperation.text = btnmultiplicacion.text
        }
        btndivision.setOnClickListener {
            txtviewOperation.text = btndivision.text
        }

        btn1.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn1.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn1.text
                txtviewOperation2.text = data2
            }
        }
        btn2.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn2.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn2.text
                txtviewOperation2.text = data2
            }
        }
        btn3.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn3.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn3.text
                txtviewOperation2.text = data2
            }
        }
        btn4.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn4.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn4.text
                txtviewOperation2.text = data2
            }
        }
        btn5.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn5.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn5.text
                txtviewOperation2.text = data2
            }
        }
        btn6.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn6.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn6.text
                txtviewOperation2.text = data2
            }
        }
        btn7.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn7.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn7.text
                txtviewOperation2.text = data2
            }
        }
        btn8.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn8.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn8.text
                txtviewOperation2.text = data2
            }
        }
        btn9.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn9.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn9.text
                txtviewOperation2.text = data2
            }
        }
        btn0.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                data1 += btn0.text
                txtviewOperation1.text = data1
            }else{
                data2 += btn0.text
                txtviewOperation2.text = data2
            }
        }
    }
}