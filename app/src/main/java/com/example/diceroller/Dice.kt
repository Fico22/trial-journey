package com.example.diceroller

/**
 * Třída hrací kostky
 */
class Dice(private val numSides: Int) {

    /**
     * funkce hození kostky
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}