package com.example.carrusel


import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton


class Vocales : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vocales)
        val decira = findViewById<ImageButton>(R.id.a)
        val decire = findViewById<ImageButton>(R.id.e)
        val deciri = findViewById<ImageButton>(R.id.i)
        val deciro = findViewById<ImageButton>(R.id.o)
        val deciru = findViewById<ImageButton>(R.id.u)
        val DURACION: Long = 500;
        val CORTA: Long = 500;


        decira.setOnClickListener{
            decira.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.letraa)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decira.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        decire.setOnClickListener{
            decire.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.letrae)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    decire.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        deciri.setOnClickListener{
            deciri.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.letrai)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    deciri.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        deciro.setOnClickListener{
            deciro.isEnabled=false

            val mp = MediaPlayer.create(this, R.raw.letrao)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    deciro.isEnabled=true
                }, CORTA)
            }, DURACION)

        }

        deciru.setOnClickListener{
            deciru.isEnabled=false

            val mp= MediaPlayer.create(this, R.raw.letrau)
            mp.start()
            Handler().postDelayed(Runnable {

                Handler().postDelayed(Runnable {
                    deciru.isEnabled=true
                }, CORTA)
            }, DURACION)

        }


    }
}