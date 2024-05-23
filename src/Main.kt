
// package is not defined as this is the main file
import com.kotlin1.fileThree.waterChange
import com.kotlin1.fileOne.randomDay
import com.kotlin1.fileTwo.food

fun main(args: Array<String>) {
    val day : String = randomDay()
    val fishfood :String = food(day)
    val change : Boolean = waterChange(22,day,34)

    return println("ON $day fish are fed $fishfood\n waterchange $change" )

}