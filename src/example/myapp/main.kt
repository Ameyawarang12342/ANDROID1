package example.myapp

import example.outExp.Out // need to import if the file is outside the package
import example.myapp2.Outer2


fun build(){
    val aquariam = prop()   // here the variable aquariam is an object (instance) of the class prop
    aquariam.print()    // we print the instance of the class prop
    aquariam.len = 60  // the properties can be changed in the function
    aquariam.print()   // here there is an another instance is created with the same name as the first one

}
fun expCheck(){
    val a = Outer2()
    a.print3()
}

fun main() {
   // build()     // we call a function in the main entry point so that the function then creates the objects and then prints it
    expCheck()
}