package com.example.carrusel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.abecedario.*
import kotlinx.android.synthetic.main.letras.*

class letras : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.letras)
        backletra.setOnClickListener(){

            val intent= Intent(this,abecedario::class.java)
            startActivity(intent)
        }
        //PONER FULL LA PANTALLA
        supportActionBar?.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val letra = findViewById<ImageView>(R.id.letras)
        val datos = intent.extras
        val i = datos?.getInt("idx")
        when (i){
            1 -> Glide.with(this).load(R.drawable.a).into(letra)
            2 -> Glide.with(this).load(R.drawable.b).into(letra)
            3 -> Glide.with(this).load(R.drawable.c).into(letra)
            4 -> Glide.with(this).load(R.drawable.d).into(letra)
            5 -> Glide.with(this).load(R.drawable.e).into(letra)
            6 -> Glide.with(this).load(R.drawable.f).into(letra)
            7 -> Glide.with(this).load(R.drawable.g).into(letra)
            8 -> Glide.with(this).load(R.drawable.h).into(letra)
            9 -> Glide.with(this).load(R.drawable.i).into(letra)
            10 -> Glide.with(this).load(R.drawable.j).into(letra)
            11 -> Glide.with(this).load(R.drawable.k).into(letra)
            12 -> Glide.with(this).load(R.drawable.l).into(letra)
            13 -> Glide.with(this).load(R.drawable.m).into(letra)
            14 -> Glide.with(this).load(R.drawable.n).into(letra)
            15 -> Glide.with(this).load(R.drawable.nn).into(letra)
            16 -> Glide.with(this).load(R.drawable.o).into(letra)
            17 -> Glide.with(this).load(R.drawable.p).into(letra)
            18 -> Glide.with(this).load(R.drawable.q).into(letra)
            19 -> Glide.with(this).load(R.drawable.r).into(letra)
            20 -> Glide.with(this).load(R.drawable.s).into(letra)
            21 -> Glide.with(this).load(R.drawable.t).into(letra)
            22 -> Glide.with(this).load(R.drawable.u).into(letra)
            23 -> Glide.with(this).load(R.drawable.v).into(letra)
            24 -> Glide.with(this).load(R.drawable.w).into(letra)
            25 -> Glide.with(this).load(R.drawable.x).into(letra)
            26 -> Glide.with(this).load(R.drawable.y).into(letra)
            27 -> Glide.with(this).load(R.drawable.z).into(letra)
            else -> {
                R.drawable.error
            }
        }
    }
}

