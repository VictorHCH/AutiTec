package com.example.carrusel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.abecedario.*
import kotlinx.android.synthetic.main.num1.*

class abecedario: AppCompatActivity() {
    //botones
    lateinit var botonA: Button
    lateinit var botonB: Button
    lateinit var botonC: Button
    lateinit var botonD: Button
    lateinit var botonE: Button
    lateinit var botonF: Button
    lateinit var botonG: Button
    lateinit var botonH: Button
    lateinit var botonI: Button
    lateinit var botonJ: Button
    lateinit var botonK: Button
    lateinit var botonL: Button
    lateinit var botonM: Button
    lateinit var botonN: Button
    lateinit var botonNN: Button
    lateinit var botonO: Button
    lateinit var botonP: Button
    lateinit var botonQ: Button
    lateinit var botonR: Button
    lateinit var botonS: Button
    lateinit var botonT: Button
    lateinit var botonU: Button
    lateinit var botonV: Button
    lateinit var botonW: Button
    lateinit var botonX: Button
    lateinit var botonY: Button
    lateinit var botonZ: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.abecedario)
        //Asociación de Botones
        botonA = findViewById(R.id.botonA)
        botonB = findViewById(R.id.botonB)
        botonC = findViewById(R.id.botonC)
        botonD = findViewById(R.id.botonD)
        botonE = findViewById(R.id.botonE)
        botonF = findViewById(R.id.botonF)
        botonG = findViewById(R.id.botonG)
        botonH = findViewById(R.id.botonH)
        botonI = findViewById(R.id.botonI)
        botonJ = findViewById(R.id.botonJ)
        botonK = findViewById(R.id.botonK)
        botonL = findViewById(R.id.botonL)
        botonM = findViewById(R.id.botonM)
        botonN = findViewById(R.id.botonN)
        botonNN = findViewById(R.id.botonNN)
        botonO = findViewById(R.id.botonO)
        botonP = findViewById(R.id.botonP)
        botonQ = findViewById(R.id.botonQ)
        botonR = findViewById(R.id.botonR)
        botonS = findViewById(R.id.botonS)
        botonT = findViewById(R.id.botonT)
        botonU = findViewById(R.id.botonU)
        botonV = findViewById(R.id.botonV)
        botonW = findViewById(R.id.botonW)
        botonX = findViewById(R.id.botonX)
        botonY = findViewById(R.id.botonY)
        botonZ = findViewById(R.id.botonZ)

        //PONER FULL LA PANTALLA
        //supportActionBar?.hide()
       // this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        backabc.setOnClickListener(){

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        //Eventos de los botones
        botonA.setOnClickListener {
            cambiarActivity(1)
        }

        botonB.setOnClickListener {
            cambiarActivity(2)
        }

        botonC.setOnClickListener {
            cambiarActivity(3)
        }

        botonD.setOnClickListener {
            cambiarActivity(4)
        }

        botonE.setOnClickListener {
            cambiarActivity(5)
        }

        botonF.setOnClickListener {
            cambiarActivity(6)
        }

        botonG.setOnClickListener {
            cambiarActivity(7)
        }

        botonH.setOnClickListener {
            cambiarActivity(8)
        }

        botonI.setOnClickListener {
            cambiarActivity(9)
        }

        botonJ.setOnClickListener {
            cambiarActivity(10)
        }

        botonK.setOnClickListener {
            cambiarActivity(11)
        }

        botonL.setOnClickListener {
            cambiarActivity(12)
        }

        botonM.setOnClickListener {
            cambiarActivity(13)
        }

        botonN.setOnClickListener {
            cambiarActivity(14)
        }

        botonNN.setOnClickListener {
            cambiarActivity(15)
        }

        botonO.setOnClickListener {
            cambiarActivity(16)
        }

        botonP.setOnClickListener {
            cambiarActivity(17)
        }

        botonQ.setOnClickListener {
            cambiarActivity(18)
        }

        botonR.setOnClickListener {
            cambiarActivity(19)
        }

        botonS.setOnClickListener {
            cambiarActivity(20)
        }

        botonT.setOnClickListener {
            cambiarActivity(21)
        }

        botonU.setOnClickListener {
            cambiarActivity(22)
        }

        botonV.setOnClickListener {
            cambiarActivity(23)
        }

        botonW.setOnClickListener {
            cambiarActivity(24)
        }

        botonX.setOnClickListener {
            cambiarActivity(25)
        }

        botonY.setOnClickListener {
            cambiarActivity(26)
        }

        botonZ.setOnClickListener {
            cambiarActivity(27)
        }
    }
    private fun cambiarActivity(letra : Int){
        val intent = Intent(this, letras::class.java)
        intent.putExtra("idx",letra)
        startActivity(intent)
    }

}

