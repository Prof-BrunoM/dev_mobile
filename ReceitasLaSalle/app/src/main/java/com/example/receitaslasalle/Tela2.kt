package com.example.receitaslasalle

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val recipeList = listOf("Receitas deliciosas", "Doces e salgados", "Sobremesas", "Melhores receitas")

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = RecipeAdapter(recipeList)

    }
}