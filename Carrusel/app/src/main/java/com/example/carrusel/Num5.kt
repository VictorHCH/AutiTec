package com.example.carrusel

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.num4.*

import kotlinx.android.synthetic.main.num5.*
import kotlinx.android.synthetic.main.num5.like2ImageView
import kotlinx.android.synthetic.main.num5.like3ImageView
import kotlinx.android.synthetic.main.num5.like4ImageView
import kotlinx.android.synthetic.main.num5.like5ImageView
import kotlinx.android.synthetic.main.num5.likeImageView
import kotlinx.android.synthetic.main.num6.*


class Num5 : AppCompatActivity() {
    val DURACION: Long = 3000;
    val CORTA: Long = 1000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num5)


        var like = false

        likeImageView.setOnClickListener {
            likeImageView.isEnabled=false
            like = likeAnimation(likeImageView, R.raw.oruga, like)
            val mp = MediaPlayer.create(this, R.raw.hola)
            mp.start()
            Handler().postDelayed(Runnable {
                like = likeAnimation(likeImageView, R.raw.oruga, like)
                Handler().postDelayed(Runnable {
                    likeImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like2 = false

        like2ImageView.setOnClickListener {

            like2ImageView.isEnabled=false
            like2 = likeAnimation(like2ImageView, R.raw.oruga, like2)
            val mp = MediaPlayer.create(this, R.raw.hola)
            mp.start()
            Handler().postDelayed(Runnable {
                like2 = likeAnimation(like2ImageView, R.raw.oruga, like2)
                Handler().postDelayed(Runnable {
                    like2ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like3 = false
        like3ImageView.setOnClickListener {
            like3ImageView.isEnabled=false
            like3 = likeAnimation(like3ImageView, R.raw.oruga, like3)
            val mp = MediaPlayer.create(this, R.raw.hola)
            mp.start()
            Handler().postDelayed(Runnable {
                like3 = likeAnimation(like3ImageView, R.raw.oruga, like3)
                Handler().postDelayed(Runnable {
                    like3ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like4 = false
        like4ImageView.setOnClickListener {
            like4ImageView.isEnabled=false
            like4 = likeAnimation(like4ImageView, R.raw.oruga, like4)
            val mp = MediaPlayer.create(this, R.raw.hola)
            mp.start()
            Handler().postDelayed(Runnable {
                like4 = likeAnimation(like4ImageView, R.raw.oruga, like4)
                Handler().postDelayed(Runnable {
                    like4ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like5 = false
        like5ImageView.setOnClickListener {
            like5ImageView.isEnabled=false
            like5 = likeAnimation(like5ImageView, R.raw.oruga, like5)
            val mp = MediaPlayer.create(this, R.raw.hola)
            mp.start()
            Handler().postDelayed(Runnable {
                like5 = likeAnimation(like5ImageView, R.raw.oruga, like5)
                Handler().postDelayed(Runnable {
                    like5ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }



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
