package com.example.carrusel

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import kotlinx.android.synthetic.main.animales.*
import kotlinx.android.synthetic.main.num1.*


class Animales : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animales)

        val decirburro = findViewById<ImageButton>(R.id.burro)
        val decircaballo = findViewById<ImageButton>(R.id.caballo)
        val decircabra = findViewById<ImageButton>(R.id.cabra)
        val decirgallina = findViewById<ImageButton>(R.id.gallina)
        val decirgato = findViewById<ImageButton>(R.id.gato)
        val decirmono = findViewById<ImageButton>(R.id.mono)
        val decirpato = findViewById<ImageButton>(R.id.patito)
        val decirpavo = findViewById<ImageButton>(R.id.pavito)

        val DURACION: Long = 3000;
        val CORTA: Long = 1000;

        backanim.setOnClickListener(){

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        decirmono.setOnClickListener{

            decirmono.isEnabled=false

            val mp = MediaPlayer.create(this,R.raw.monosonido)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decirmono.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decirpato.setOnClickListener{
            decirpato.isEnabled=false

            val mp = MediaPlayer.create(this,R.raw.patosonido)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decirpato.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decirpavo.setOnClickListener{
            decirpavo.isEnabled=false

            val mp = MediaPlayer.create(this,R.raw.pavosonido)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decirpavo.isEnabled=true
                }, CORTA)
            }, DURACION)

        }
        decirburro.setOnClickListener{
            decirburro.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.burro)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decirburro.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decircaballo.setOnClickListener{
            decircaballo.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.caballo)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decircaballo.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decircabra.setOnClickListener{
            decircabra.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.cabra)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decircabra.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decirgallina.setOnClickListener{
            decirgallina.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.gallina)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decirgallina.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decirgato.setOnClickListener{
            decirgato.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.gato)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decirgato.isEnabled=true
                }, CORTA)
            }, DURACION)

        }
    }
}