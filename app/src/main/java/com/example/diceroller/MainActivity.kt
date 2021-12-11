package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.ImageViewCompat

/**
 * Tato aplikace háže kostkou
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }

        rollDice()
    }

    /**
     *  Funkce hození kostkou
     */
    private fun rollDice() {

        val dice = Dice(6)
        val dice2 = Dice(6)
        val rollDice = arrayOf(dice.roll(), dice2.roll())

        val redDiceImage: ImageView = findViewById(R.id.imageView)
        val diceImage: ImageView = findViewById(R.id.imageView2)

        val imageView = arrayOf(redDiceImage, diceImage)

        var i = 0
        /** Cyklus pro výběr obrázku kostky */
        for(toss in rollDice) {

            val redDice = when (toss) {
                1 -> R.drawable.red_dice_1
                2 -> R.drawable.red_dice_2
                3 -> R.drawable.red_dice_3
                4 -> R.drawable.red_dice_4
                5 -> R.drawable.red_dice_5
                else -> R.drawable.red_dice_6
            }

            imageView[i].setImageResource(redDice)
            i++
        }

    }
}