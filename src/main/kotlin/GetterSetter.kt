
fun main(args: Array<String>){
   var cars = WeirdCar()
    cars.speed = 100
    println("car.speed ${cars.speed}")
    println("car.name ${cars.name}")

}

class WeirdCar {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "High speed car $value"

        }
}