package com.kotlin1.fileTwo

fun food (day: String) : String {

        val food : String

        when (day) {
            "mon" -> food = "flakes"
            "tue" -> food = "fries"
            "wed" -> food = "coke"
            "thr" -> food = "mcd"
            "fri" -> food = "PIZZA"
            "sat" -> food = "suns"
            else -> food = "juice"


        }
        return food
    }
