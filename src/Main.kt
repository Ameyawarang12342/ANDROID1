
// package is not defined as this is the main file

import com.kotlin1.fileOne.randomDay
import com.kotlin1.fileTwo.food

fun main(args: Array<String>) {
    val day = randomDay()
    val fishfood :String = food(day)

    return println("ON $day fish are fed $fishfood")
}