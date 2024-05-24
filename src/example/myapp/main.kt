package example.myapp


import example.myapp2.Outer2


fun build(){
    var aquariam = Prop()
    aquariam.print()

    var aquariam2 = Prop(len = 40)
    aquariam2.print()
}


fun main() {
   build()
}