fun main(args:Array<String>){
    val table = Table()
    println(table.color)

    val garage = Garage()
    garage.car.drive()
}

class Table {
        val color: String = "white"
}
class MyCar {
    fun drive() {
        println("Driving along in my car")
    }
}
class Garage {
    val car = MyCar()
}