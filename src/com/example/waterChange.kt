package com.kotlin1.fileThree

import com.kotlin1.fileOne.randomDay

fun waterChange(temp : Int , day :String, dirt : Int ): Boolean
    {
        return when {
            temp > 50 -> true
            day == "sun" -> true
            dirt > 50 -> true
            else -> false
        }
    }