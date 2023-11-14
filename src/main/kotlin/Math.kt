fun main(args:Array<String>){
    val myMath = Math()

    println("Addition is ${myMath.add(11,12)}")
    println("Subtraction is ${myMath.sub(1,10)}")
    println("Multiplication is ${myMath.mul(1,22)}")
    println("Division is ${myMath.div(1,12)}")

}

class Math {
    //practiec
//    Create a class Math. It has four functions:●
//    Add - takes two parameters and returns the sum●
//    Sub - takes two parameters and returns the difference●
//    Mul - takes two parameters and returns the multiplication●
//    Div - takes two parameters and returns the division
//    Create an object of that class and try out its methods

    fun add(a: Int,b: Int) = a + b
    fun sub(a: Int,b: Int) = a - b
    fun mul(a: Int,b: Int) = a * b
    fun div(a: Int,b: Int) = a / b



}