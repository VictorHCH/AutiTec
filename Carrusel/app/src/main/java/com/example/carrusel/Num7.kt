package com.example.carrusel

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.num6.*
import kotlinx.android.synthetic.main.num7.*
import kotlinx.android.synthetic.main.num7.like2ImageView
import kotlinx.android.synthetic.main.num7.like3ImageView
import kotlinx.android.synthetic.main.num7.like4ImageView
import kotlinx.android.synthetic.main.num7.like5ImageView
import kotlinx.android.synthetic.main.num7.like6ImageView
import kotlinx.android.synthetic.main.num7.likeImageView


class Num7 : AppCompatActivity() {
    val DURACION: Long = 3000;
    val CORTA: Long = 1000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.num7)

        backnum7.setOnClickListener(){

            val intent= Intent(this,MenuNumros::class.java)
            startActivity(intent)
        }


        var like = false

        likeImageView.setOnClickListener {
            likeImageView.isEnabled=false
            like = likeAnimation(likeImageView, R.raw.cotorra, like)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like = likeAnimation(likeImageView, R.raw.cotorra, like)
                Handler().postDelayed(Runnable {
                    likeImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like2 = false

        like2ImageView.setOnClickListener {

            like2ImageView.isEnabled=false
            like2 = likeAnimation(like2ImageView, R.raw.cotorra, like2)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like2 = likeAnimation(like2ImageView, R.raw.cotorra, like2)
                Handler().postDelayed(Runnable {
                    like2ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like3 = false
        like3ImageView.setOnClickListener {
            like3ImageView.isEnabled=false
            like3 = likeAnimation(like3ImageView, R.raw.cotorra, like3)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like3 = likeAnimation(like3ImageView, R.raw.cotorra, like3)
                Handler().postDelayed(Runnable {
                    like3ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like4 = false
        like4ImageView.setOnClickListener {
            like4ImageView.isEnabled=false
            like4 = likeAnimation(like4ImageView, R.raw.cotorra, like4)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like4 = likeAnimation(like4ImageView, R.raw.cotorra, like4)
                Handler().postDelayed(Runnable {
                    like4ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like5 = false
        like5ImageView.setOnClickListener {
            like5ImageView.isEnabled=false
            like5 = likeAnimation(like5ImageView, R.raw.cotorra, like5)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like5 = likeAnimation(like5ImageView, R.raw.cotorra, like5)
                Handler().postDelayed(Runnable {
                    like5ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like6 = false
        like6ImageView.setOnClickListener {
            like6ImageView.isEnabled=false
            like6 = likeAnimation(like6ImageView, R.raw.cotorra, like6)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like6 = likeAnimation(like6ImageView, R.raw.cotorra, like6)
                Handler().postDelayed(Runnable {
                    like6ImageView.isEnabled=true
                }, CORTA)
            }, DURACION)
        }
        var like7 = false
        like7ImageView.setOnClickListener {
            like7ImageView.isEnabled=false
            like7 = likeAnimation(like7ImageView, R.raw.cotorra, like7)
            val mp = MediaPlayer.create(this, R.raw.cotorrosonido)
            mp.start()
            Handler().postDelayed(Runnable {
                like7 = likeAnimation(like7ImageView, R.raw.cotorra, like7)
                Handler().postDelayed(Runnable {
                    like7ImageView.isEnabled=true
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
