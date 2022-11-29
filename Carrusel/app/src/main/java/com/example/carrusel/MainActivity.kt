package com.example.carrusel

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.carrusel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        val gameList= ArrayList<ModelJuegos>()
        gameList.add(ModelJuegos(R.drawable.number, "Numeros"))
        gameList.add(ModelJuegos(R.drawable.vocale, "Vocales"))
        gameList.add(ModelJuegos(R.drawable.alfa, "Alfabeto"))
        gameList.add(ModelJuegos(R.drawable.leon, "Animales"))
        gameList.add(ModelJuegos(R.drawable.formas, "Formas"))

        val adapter= JuegosAdapter(gameList)

        binding.apply {
            carouselRecyclerView.adapter=adapter
            carouselRecyclerView.set3DItem(false)
            carouselRecyclerView.setAlpha(true)
            carouselRecyclerView.setInfinite(true)

        }
    }


    override fun onBackPressed() {

        System.exit(0);

    }
}