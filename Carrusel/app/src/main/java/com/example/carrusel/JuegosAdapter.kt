package com.example.carrusel

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.carrusel.databinding.CarouselItemBinding

class JuegosAdapter(private var gameList: List<ModelJuegos>):RecyclerView.Adapter<JuegosAdapter.GameViewHolder>() {

    class GameViewHolder(val binding: CarouselItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val binding= CarouselItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = gameList[position]

        holder.binding.apply {
            Glide.with(gameImage).load(game.image).into(gameImage)
            gameName.text=game.name


            gameImage.setOnClickListener{
                if (gameName.text=="Numeros") {
                    val intent: Intent = Intent(it.context, MenuNumros::class.java)
                    it.context.startActivity(intent)

                }
                if (gameName.text=="Vocales") {
                    val intent: Intent = Intent(it.context, Vocales::class.java)
                    it.context.startActivity(intent)

                }
                if (gameName.text=="Animales") {
                    val intent: Intent = Intent(it.context, Animales::class.java)
                    it.context.startActivity(intent)

                }
                if (gameName.text=="Alfabeto") {
                    val intent: Intent = Intent(it.context, Formas::class.java)
                    it.context.startActivity(intent)

                }
                if (gameName.text=="Formas") {
                    val intent: Intent = Intent(it.context, Formas::class.java)
                    it.context.startActivity(intent)

                }
                else{Toast.makeText(it.context , gameName.text, Toast.LENGTH_SHORT).show()}
            }



        }
    }

    override fun getItemCount(): Int = gameList.size
}