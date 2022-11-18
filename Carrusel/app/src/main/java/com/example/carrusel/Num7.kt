package com.example.carrusel

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.num7.*


class Num7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num7)


        var like = false

        likeImageView.setOnClickListener {
            like = likeAnimation(likeImageView, R.raw.cotorra, like)
        }

        var like2 = false

        like2ImageView.setOnClickListener {
            like2 = likeAnimation(like2ImageView, R.raw.cotorra, like2)
        }
        var like3 = false
        like3ImageView.setOnClickListener {
            like3 = likeAnimation(like3ImageView, R.raw.cotorra, like3)
        }
        var like4 = false
        like4ImageView.setOnClickListener {
            like4 = likeAnimation(like4ImageView, R.raw.cotorra, like4)
        }
        var like5 = false
        like5ImageView.setOnClickListener {
            like5 = likeAnimation(like5ImageView, R.raw.cotorra, like5)
        }
        var like6 = false
        like6ImageView.setOnClickListener {
            like6 = likeAnimation(like6ImageView, R.raw.cotorra, like6)
        }
        var like7 = false
        like7ImageView.setOnClickListener {
            like7 = likeAnimation(like7ImageView, R.raw.cotorra, like7)
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
