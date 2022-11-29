package com.example.carrusel

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.num2.*

import kotlinx.android.synthetic.main.num3.*
import kotlinx.android.synthetic.main.num3.like2ImageView
import kotlinx.android.synthetic.main.num3.likeImageView


class Num3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num3)
        val DURACION: Long = 3000;
        val CORTA: Long = 1000;
        backnum3.setOnClickListener(){

            val intent= Intent(this,MenuNumros::class.java)
            startActivity(intent)
        }
        var like = false

        likeImageView.setOnClickListener {
            likeImageView.isEnabled=false
            like = likeAnimation(likeImageView, R.raw.tiger, like)
            val mp = MediaPlayer.create(this, R.raw.sonido_1)
            mp.start()
            Handler().postDelayed(Runnable {
                like = likeAnimation(likeImageView, R.raw.tiger, like)
                Handler().postDelayed(Runnable {
                    likeImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like2 = false

        like2ImageView.setOnClickListener {

            like2ImageView.isEnabled=false
            like2 = likeAnimation(like2ImageView, R.raw.tiger, like2)
            val mp = MediaPlayer.create(this, R.raw.sonido_2)
            mp.start()
            Handler().postDelayed(Runnable {
                like2 = likeAnimation(like2ImageView, R.raw.tiger, like2)
                Handler().postDelayed(Runnable {
                    like2ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like3 = false
        like3ImageView.setOnClickListener {
            like3ImageView.isEnabled=false
            like3 = likeAnimation(like3ImageView, R.raw.tiger, like3)
            val mp = MediaPlayer.create(this, R.raw.sonido_3)
            mp.start()
            Handler().postDelayed(Runnable {
                like3 = likeAnimation(like3ImageView, R.raw.tiger, like3)
                Handler().postDelayed(Runnable {
                    like3ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }



    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MenuNumros::class.java))

    }

    private fun likeAnimation(imageView: LottieAnimationView,
                              animation: Int,
                              like: Boolean) : Boolean {

        if (!like) {
            imageView.setAnimation(animation)
            imageView.playAnimation()
        } else {
            imageView.animate()
                .alpha(1f)
                .setDuration(200)
                .setListener(object : AnimatorListenerAdapter() {

                    override fun onAnimationEnd(animator: Animator) {

                        imageView.setImageResource(R.drawable.burbuja)
                        imageView.alpha = 1f
                    }

                })

        }

        return !like
    }

}
