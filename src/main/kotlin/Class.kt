
fun main(args:Array<String>){

    val myCar:Car = Car()
    val yourCar = Car()

    myCar.topSpeed = 150
    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.driveSpeed(50)

    yourCar.start()
    yourCar.driveSpeed(25)

}
class Car {
    var model:String? = null
    var topSpeed = 100

    fun start(){
        println("Starting the $model")
    }
    fun driveSpeed(speed:Int){
        println("Driving at a speed of $speed")
    }

}