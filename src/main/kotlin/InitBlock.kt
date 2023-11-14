fun main(args:Array<String>){
  var car = Car3()
    var laptop = Laptop("windows 10 pro")
    var browser = Browser()

}
class Car3{
    var model = "BMW"
    var topSpeed = 100

    init {
        println("Model $model top speed $topSpeed")
    }

}

//practice
//A laptop needs to have an operating system when running for the first time.
//Design a program that creates a class Laptop and prints a message that the operating
//system is being installed whenever an object of thatclass is created.

class Laptop(var operatingSystem:String){
    init {
        println("Operating system is $operatingSystem installing")
    }
}

//Exercise
//A web browser will connect and display the home page when first started.
//Create a class that achieves this functionality when instantiated.

class Browser(){
    init {
        println("Web browser is connecting")
        println("http://www.google.com")
    }
}
