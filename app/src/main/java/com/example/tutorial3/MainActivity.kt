package com.example.tutorial3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.tutorial3.Models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edt1:EditText
    lateinit var edt2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
    }

    fun btnclick(v:View){
        var ans = 0.0

        val calculator = Calculator(edt1.text.toString().toDouble(),edt2.text.toString().toDouble())



        when(v.id){
            R.id.btnadd ->ans = calculator.add()
            R.id.btnsub ->ans = calculator.subtract()
            R.id.btnmul ->ans = calculator.multiply()
            R.id.btndiv ->ans = calculator.divide()
        }

        Toast.makeText(this,"Answer = $ans ",Toast.LENGTH_LONG).show()



    }

}