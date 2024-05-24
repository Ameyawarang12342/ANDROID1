
// package is not defined as this is the main file
import com.kotlin1.fileThree.waterChange
import com.kotlin1.fileOne.randomDay
import com.kotlin1.fileTwo.food



fun main(args: Array<String>) {
   val a = listOf("am","sm","dm","an","Sn","dn")



    val b = a.asSequence().map {
        println("b: $it")
        it
    }

   //println("first : ${b.first()}")
    // here the sequence evaluates all elements until the terminal operation (first) and in the process of evaluation
    // we havc placed a println statement in the map thus is is being executed

    println("all : ${b.toList()}")
    // here all the elements are evaluated as there is no terminal operation give hence all of them are printed
}