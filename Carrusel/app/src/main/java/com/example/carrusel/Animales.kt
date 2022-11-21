package com.example.carrusel

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class Animales : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animales)

        val decirburro = findViewById<ImageButton>(R.id.burro)
        val decircaballo = findViewById<ImageButton>(R.id.caballo)
        val decircabra = findViewById<ImageButton>(R.id.cabra)
        val decirgallina = findViewById<ImageButton>(R.id.gallina)
        val decirgato = findViewById<ImageButton>(R.id.gato)
        val decirmono = findViewById<ImageButton>(R.id.monito)
        val decirpato = findViewById<ImageButton>(R.id.patito)
        val decirpavo = findViewById<ImageButton>(R.id.pavito)

        decirmono.setOnClickListener{
            val mp = MediaPlayer.create(this,R.raw.monosonido)
            mp.start()
        }

        decirpato.setOnClickListener{
            val mp = MediaPlayer.create(this,R.raw.patosonido)
            mp.start()
        }

        decirpavo.setOnClickListener{
            val mp = MediaPlayer.create(this,R.raw.pavosonido)
            mp.start()
        }
        decirburro.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.burro)
            mp.start()
        }

        decircaballo.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.caballo)
            mp.start()
        }

        decircabra.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.cabra)
            mp.start()
        }

        decirgallina.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.gallina)
            mp.start()
        }

        decirgato.setOnClickListener{
            val mp = MediaPlayer.create(this, R.raw.gato)
            mp.start()
        }
    }
}