package com.kotlin1.fileThree

import com.kotlin1.fileOne.randomDay


fun waterChange(temp : Int , day :String, dirt : Int ): Boolean
    {
    fun temp2 (temp:Int) = temp > 30
        return when {
            temp2(temp) -> true
            day == "sun" -> true
            dirt > 50 -> true
            else -> false

    }
}