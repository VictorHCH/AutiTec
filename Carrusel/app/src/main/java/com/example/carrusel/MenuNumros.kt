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
            finish()
        }
        muno.setOnClickListener(){

            val intent= Intent(this,Num1::class.java)
            startActivity(intent)
            finish()
        }
        mdos.setOnClickListener(){

            val intent= Intent(this,Num2::class.java)
            startActivity(intent)
            finish()
        }
        mtres.setOnClickListener(){

            val intent= Intent(this,Num3::class.java)
            startActivity(intent)
            finish()
        }
        mcuatro.setOnClickListener(){

            val intent= Intent(this,Num4::class.java)
            startActivity(intent)
            finish()
        }
        mcinco.setOnClickListener(){

            val intent= Intent(this,Num5::class.java)
            startActivity(intent)
            finish()
        }
        mseis.setOnClickListener(){

            val intent= Intent(this,Num6::class.java)
            startActivity(intent)
            finish()
        }
        msiete.setOnClickListener(){

            val intent= Intent(this,Num7::class.java)
            startActivity(intent)
            finish()
        }
        mocho.setOnClickListener(){

            val intent= Intent(this,Num8::class.java)
            startActivity(intent)
            finish()
        }
        mnueve.setOnClickListener(){

            val intent= Intent(this,Num9::class.java)
            startActivity(intent)
            finish()
        }


    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))

    }

}