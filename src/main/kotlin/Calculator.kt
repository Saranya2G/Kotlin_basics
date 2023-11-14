fun main(args: Array<String>){
    val calc = Calculator()
    calc.add(12.10)
    calc.sub(11.10)
    calc.mul(22.10)
    calc.div(40.10)
    calc.reset()
    calc.add(12.0)




}
class Calculator {


    //Exercise
//    Create a calculator class. It should have
//    A variable that stores the total
//    A function that adds a number to the total
//    A function that subtracts a number from the total
//    A function that multiplies the total by an amount
//    A function that divides the total by an amount
//    A function that resets the total to 0
//    Create an object, test out the functions and print out some results.

    var total = 0.0
    fun add(a: Double) {
        total += a
        println("+ $a")
        println("= ${total}")
    }

    fun sub(a: Double) {
        total -= a
        println("- $a")
        println("= ${total}")
    }

    fun mul(a: Double) {
        total *= a
        println("* $a")
        println("= ${total}")
    }

    fun div(a: Double) {
        total /= a
        println("/ $a")
        println("= ${total}")
    }

    fun reset() {
        total = 0.0
        println("= ${total}")
    }
}
