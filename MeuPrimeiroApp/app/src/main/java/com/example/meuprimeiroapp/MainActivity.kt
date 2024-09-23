package com.example.meuprimeiroapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var tx : TextView
    lateinit var bt : Button
    lateinit var ed : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tx = findViewById(R.id.textView)
        bt = findViewById(R.id.button)
        ed = findViewById(R.id.editText)

        bt.setOnClickListener(View.OnClickListener {
            tx.text = ed.text.toString()
            Toast.makeText(applicationContext, "Hello Kotlin!", Toast.LENGTH_LONG).show()
        })

    }
}