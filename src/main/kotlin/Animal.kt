fun main(args:Array<String>){
    var myAnimal = Animal()
    myAnimal.run()

    myAnimal.name = "cat"
    myAnimal.topSpeed = 12
    myAnimal.run()
}

class Animal {

    //Exercise
//    Create a class called Animal.
//    It has a variable topSpeed and a function run() that prints out a message which states the animal’s topspeed.
//    Create an object from that class, and run the function.Update the variable and run the function again.
    var topSpeed = 0
    var name = ""

fun run(){
    println("$name top speed is $topSpeed")
}
}
