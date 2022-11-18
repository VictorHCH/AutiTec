package com.example.carrusel


import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


        decira.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.letraa)
            mp.start()
        }

        decire.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.letrae)
            mp.start()
        }

        deciri.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.letrai)
            mp.start()
        }

        deciro.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.letrao)
            mp.start()
        }

        deciru.setOnClickListener{
            val mp= MediaPlayer.create(this, R.raw.letrau)
            mp.start()
        }


    }
}