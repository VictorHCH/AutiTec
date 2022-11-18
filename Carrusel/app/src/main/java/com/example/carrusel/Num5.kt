package com.example.carrusel

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.num4.*

import kotlinx.android.synthetic.main.num5.*
import kotlinx.android.synthetic.main.num5.like2ImageView
import kotlinx.android.synthetic.main.num5.like3ImageView
import kotlinx.android.synthetic.main.num5.like4ImageView
import kotlinx.android.synthetic.main.num5.likeImageView


class Num5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num5)


        var like = false

        likeImageView.setOnClickListener {
            like = likeAnimation(likeImageView, R.raw.oruga, like)
        }

        var like2 = false

        like2ImageView.setOnClickListener {
            like2 = likeAnimation(like2ImageView, R.raw.oruga, like2)
        }
        var like3 = false
        like3ImageView.setOnClickListener {
            like3 = likeAnimation(like3ImageView, R.raw.oruga, like3)
        }
        var like4 = false
        like4ImageView.setOnClickListener {
            like4 = likeAnimation(like4ImageView, R.raw.oruga, like4)
        }
        var like5 = false
        like5ImageView.setOnClickListener {
            like5 = likeAnimation(like5ImageView, R.raw.oruga, like5)
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
