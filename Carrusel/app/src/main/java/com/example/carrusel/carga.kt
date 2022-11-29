package com.example.carrusel


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import com.bumptech.glide.Glide

class carga : AppCompatActivity() {

    val DURACION: Long = 8000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carga)

        //PONER FULL LA PANTALLA
        supportActionBar?.hide()
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val logoPuzzle = findViewById<ImageView>(R.id.img)
        Glide.with(this).load(R.drawable.animation_500_laxjvc37).into(logoPuzzle)

        val cargaBarra = findViewById<ImageView>(R.id.img2)
        Glide.with(this).load(R.drawable.animation_640_lb2drkha).into(cargaBarra)

        val eleph = findViewById<ImageView>(R.id.img3)
        Glide.with(this).load(R.drawable.animation_500_laxk02w8).into(eleph)


        cambiarActivity()
    }

    private fun cambiarActivity(){
        Handler().postDelayed(Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, DURACION)
    }
}