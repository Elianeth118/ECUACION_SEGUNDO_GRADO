package com.example.ecuacion_segundo_grado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt

class calcularActivity : AppCompatActivity() {
    lateinit var btnCalcular: Button
    lateinit var aEdit: EditText
    lateinit var bEdit: EditText
    lateinit var  cEdit:EditText
    lateinit var  textEcuacion: TextView
    lateinit var textResultado: TextView
    lateinit var btnVolver:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)
        btnCalcular=findViewById(R.id.btnCalcular)
        aEdit=findViewById(R.id.aEditText)
        bEdit=findViewById(R.id.bEditText)
        cEdit=findViewById(R.id.cEditText)
        textResultado=findViewById(R.id.textResultado)
        textEcuacion=findViewById(R.id.textEcuacion)
        btnVolver=findViewById(R.id.btnSalir)
btnVolver.setOnClickListener {
    val intent: Intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
}
        btnCalcular.setOnClickListener {
            calcularRaiz()
        }
    }
    private fun calcularRaiz(){
        val a= aEdit.text.toString().toDouble()
        val b= bEdit.text.toString().toDouble()
        val c= cEdit.text.toString().toDouble()

        val ecuacion ="Ecuacion: $a* x^2 + $b * x +$c=0"

        textEcuacion.text=ecuacion

        val discriminante= b*b-4*a*c

        val x1: Double
        val x2: Double

        if(discriminante>0){
            x1=(+b + sqrt(discriminante))/(2*a)
            x2=(-b - sqrt(discriminante))/(2*a)
            val resultado ="x1:$x1\n x2: $x2"
            textResultado.text= resultado
        }else if(discriminante==0.0){
            x1=-b/(2*a)
            val resultado= "Raiz Doble: $x1"
            textResultado.text= resultado

        }else{
            val resultado="La ecuacion no tiene solución"
            textResultado.text=resultado
        }



    }
}