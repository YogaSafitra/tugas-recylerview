package com.example

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(private val context:Context, private val superhero: List<Superhero>, val Listener: (Superhero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>(){

    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
    }

    override fun getItemCount(): Int = superhero.size
    }

    override fun onBindViewHolder(holder: SuperheroAdapter.SuperheroViewHolder, position: Int) {
    }
}