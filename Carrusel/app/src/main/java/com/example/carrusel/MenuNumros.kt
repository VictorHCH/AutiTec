package com.example.carrusel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.menu_numeros.*

class MenuNumros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_numeros)

        back.setOnClickListener(){

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        muno.setOnClickListener(){

            val intent= Intent(this,Num1::class.java)
            startActivity(intent)
        }
        mdos.setOnClickListener(){

            val intent= Intent(this,Num2::class.java)
            startActivity(intent)
        }
        mtres.setOnClickListener(){

            val intent= Intent(this,Num3::class.java)
            startActivity(intent)
        }
        mcuatro.setOnClickListener(){

            val intent= Intent(this,Num4::class.java)
            startActivity(intent)
        }
        mcinco.setOnClickListener(){

            val intent= Intent(this,Num5::class.java)
            startActivity(intent)
        }
        mseis.setOnClickListener(){

            val intent= Intent(this,Num6::class.java)
            startActivity(intent)
        }
        msiete.setOnClickListener(){

            val intent= Intent(this,Num7::class.java)
            startActivity(intent)
        }
        mocho.setOnClickListener(){

            val intent= Intent(this,Num8::class.java)
            startActivity(intent)
        }
        mnueve.setOnClickListener(){

            val intent= Intent(this,Num9::class.java)
            startActivity(intent)
        }


    }
}