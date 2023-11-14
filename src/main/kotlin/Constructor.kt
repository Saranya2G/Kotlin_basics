fun main(args:Array<String>){

    val cars = Cars()
    val myCars = Cars("BMW")
    val yourCars = Cars("BMW",20)



}
//class Cars(var newModel: String, var newSpeed: Int) {
//
//}

//A class can have multiple ways of being created Which constructor is used depends on parameters
class Cars {
    constructor() {
        model = "No model"
        topSpeed = 150
    }
    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }
    constructor(newModel: String, newSpeed: Int) {
        model = newModel
        topSpeed = newSpeed
    }
    var model: String? = null
    var topSpeed = 100

}