package example.myapp

// in this example we study about the constructors
// basically if we want to construct an instance of the object we make a function with various parameters
// by writing the default values inside class we declare them after construcuting an instance of the class

// we can construct with default values

class Prop( var len : Int = 10 ,var bre : Int = 10, var wid : Int = 10) {




fun print() {
    println("len = $len ,  bre = $bre , wid = $wid")
}

}
