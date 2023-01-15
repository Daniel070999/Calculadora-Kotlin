package com.example.practicakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.io.IOException
import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.roundToInt

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
        val btnpunto = findViewById<Button>(R.id.btnpunto) as Button

        val btnsuma = findViewById<Button>(R.id.btnsuma) as Button
        val btnresta = findViewById<Button>(R.id.btnresta) as Button
        val btnmultiplicacion = findViewById<Button>(R.id.btnmultiplicacion) as Button
        val btndivision = findViewById<Button>(R.id.btndivision) as Button
        val btnporcentaje = findViewById<Button>(R.id.btnporcentaje) as Button
        val btnfactorial = findViewById<Button>(R.id.btnfactorial) as Button

        val btnlimpiar = findViewById<Button>(R.id.btnlimpiar) as Button
        val btnigual = findViewById<Button>(R.id.btnigual) as Button

        val txtviewOperation1 = findViewById<Button>(R.id.txtviewOperation1) as TextView
        val txtviewOperation = findViewById<Button>(R.id.txtviewOperation) as TextView
        val txtviewOperation2 = findViewById<Button>(R.id.txtviewOperation2) as TextView
        val txtviewResultado = findViewById<Button>(R.id.txtviewResultado) as TextView

        btnigual.setOnClickListener {
            if (txtviewOperation1.text.contains("--") || txtviewOperation.text.contains("--") || txtviewOperation2.text.contains("--")){
                Toast.makeText(applicationContext, "Ingrese una operación válida", Toast.LENGTH_SHORT).show()
            }else{
                if (txtviewOperation.text.contains("+")){
                    val df = DecimalFormat("#.##")
                    val data1mod = df.format(data1.toFloat())
                    val data2mod = df.format(data2.toFloat())
                    val resultado = data1mod.toFloat() + data2mod.toFloat()
                    txtviewResultado.text = resultado.toString()
                }
                if (txtviewOperation.text.contains("-")){
                    val df = DecimalFormat("#.##")
                    val data1mod = df.format(data1.toFloat())
                    val data2mod = df.format(data2.toFloat())
                    val resultado = data1mod.toFloat() - data2mod.toFloat()
                    txtviewResultado.text = resultado.toString()
                }
                if (txtviewOperation.text.contains("*")){
                    val df = DecimalFormat("#.##")
                    val data1mod = df.format(data1.toFloat())
                    val data2mod = df.format(data2.toFloat())
                    val resultado = data1mod.toFloat() * data2mod.toFloat()
                    txtviewResultado.text = resultado.toString()
                }
                if (txtviewOperation.text.contains("/")){
                    val df = DecimalFormat("#.##")
                    val data1mod = df.format(data1.toFloat())
                    val data2mod = df.format(data2.toFloat())
                    val resultado = data1mod.toFloat() / data2mod.toFloat()
                    txtviewResultado.text = resultado.toString()
                }
            }
        }

        btnporcentaje.setOnClickListener {
            if (txtviewOperation1.text.contains("--")){
                Toast.makeText(applicationContext, "Por favor, ingrese un valor primero", Toast.LENGTH_SHORT).show()
            }else if(txtviewOperation2.text != "--") {
                Toast.makeText(
                    applicationContext,
                    "Esta operación no está permitida",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val df = DecimalFormat("#.##")
                val data1mod = df.format(data1.toFloat())
                val resultado = (data1mod.toFloat() * 0.01)
                txtviewResultado.text = resultado.toString()
                txtviewOperation.text = "% = "
                txtviewOperation2.text = resultado.toString()
            }
        }

        btnfactorial.setOnClickListener {
            if (txtviewOperation1.text.contains("--")){
                Toast.makeText(applicationContext, "Por favor, ingrese un valor primero", Toast.LENGTH_SHORT).show()
            }else if(txtviewOperation2.text != "--") {
                Toast.makeText(
                    applicationContext,
                    "Esta operación no está permitida",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val df = DecimalFormat("#.##")
                val data1mod = df.format(data1.toFloat())
                val resultado = factorial(data1mod.toFloat())
                txtviewResultado.text = resultado.toString()
                txtviewOperation.text = "! = "
                txtviewOperation2.text = resultado.toString()
            }
        }

        btnlimpiar.setOnClickListener {
            txtviewOperation1.text = "--"
            txtviewOperation.text = "--"
            txtviewOperation2.text = "--"
            data1 = ""
            data2 = ""
            txtviewResultado.text = "Resultado"
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
        btnpunto.setOnClickListener {
            if (txtviewOperation.text.contains("--")){
                if (txtviewOperation1.text.contains(".")){
                }else{
                    data1 += btnpunto.text
                    txtviewOperation1.text = data1
                }
            }else{
                if (txtviewOperation2.text.contains(".")){
                }else{
                    data2 += btnpunto.text
                    txtviewOperation2.text = data2
                }
            }
        }
    }
    fun factorial(numero: Float): Float {
        if (numero > 1){
            return numero * factorial(numero - 1)
        } else {
            return numero
        }
    }

    }
