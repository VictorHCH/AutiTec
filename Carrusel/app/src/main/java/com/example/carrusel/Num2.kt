package com.example.carrusel

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView

import kotlinx.android.synthetic.main.num2.*


class Num2 : AppCompatActivity() {
    val DURACION: Long = 3000;
    val CORTA: Long = 1000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num2)


        var like = false

        likeImageView.setOnClickListener {
            likeImageView.isEnabled=false
            like = likeAnimation(likeImageView, R.raw.mapache, like)
            val mp = MediaPlayer.create(this, R.raw.burbujas)
            mp.start()
            Handler().postDelayed(Runnable {
                like = likeAnimation(likeImageView, R.raw.mapache, like)
                Handler().postDelayed(Runnable {
                    likeImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like2 = false

        like2ImageView.setOnClickListener {

            like2ImageView.isEnabled=false
            like2 = likeAnimation(like2ImageView, R.raw.mapache, like2)
            val mp = MediaPlayer.create(this, R.raw.burbujas)
            mp.start()
            Handler().postDelayed(Runnable {
                like2 = likeAnimation(like2ImageView, R.raw.mapache, like2)
                Handler().postDelayed(Runnable {
                    like2ImageView.isEnabled=true
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
