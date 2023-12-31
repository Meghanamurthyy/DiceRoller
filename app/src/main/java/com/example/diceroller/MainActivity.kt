package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = DiceRoll(6)
        val d1 = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = d1.toString()
    }
}
class DiceRoll(private val numOfSides:Int)
{
    fun roll():Int{
        return (1..numOfSides).random()
    }
}