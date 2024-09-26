package com.example.receitaslasalle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(private val listRecipe : List<String>) : RecyclerView.Adapter<RecipeAdapter.RecipeItemHolder>(){

    class RecipeItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recipeName : TextView = itemView.findViewById(R.id.tvRecipeName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeItemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_receita,parent, false)
        return RecipeItemHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listRecipe.size
    }

    override fun onBindViewHolder(holder: RecipeItemHolder, position: Int) {
        val recipe = listRecipe[position]
        holder.recipeName.text = recipe
    }

}