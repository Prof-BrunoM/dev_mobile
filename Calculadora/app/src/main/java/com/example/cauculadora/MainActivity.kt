package com.example.cauculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var editText: TextView
    var currentNumber: String = ""
    var operator: String = ""
    var firstOper: Double = 0.0
    var secondOper: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editText = findViewById<EditText>(R.id.editText)
        setButtonListener(R.id.button1,"7")
        setButtonListener(R.id.button2,"8")
        setButtonListener(R.id.button3,"9")
        setButtonListener(R.id.button5,"4")
        setButtonListener(R.id.button6,"5")
        setButtonListener(R.id.button7,"6")
        setButtonListener(R.id.button9,"1")
        setButtonListener(R.id.button10,"2")
        setButtonListener(R.id.button11,"3")

        setOperator(R.id.button4,"/")
        setOperator(R.id.button8,"*")
        setOperator(R.id.button12,"-")
        setOperator(R.id.button16,"+")

        findViewById<Button>(R.id.button14).setOnClickListener{
            secondOper = editText.text.toString().toDouble()
            var res: Double = 0.0
            when (operator){
                "+" -> res = firstOper + secondOper
                "-" -> res = firstOper - secondOper
                "*" -> res = firstOper * secondOper
                "/" -> res = firstOper / secondOper
            }
            editText.text = res.toString()
        }

    }

    fun setButtonListener(btId: Int, value: String){
        findViewById<Button>(btId).setOnClickListener{
            currentNumber += value
            editText.text = currentNumber
        }
    }

    fun setOperator(btId: Int, value: String){
        findViewById<Button>(btId).setOnClickListener {
            firstOper = editText.text.toString().toDouble()
            operator = value
            editText.text = operator
            currentNumber = ""
        }
    }
}