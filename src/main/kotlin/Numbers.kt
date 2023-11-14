fun main(args: Array<String>){
    val number = 12
    println(number)
    println(number::class.java)

    //Exersice

//    Ask the user to input a number and read it into a variable.
// Convert it to an integer.
// Multiply that value with a double variable that you created.
//    What is the type of the new variable?
//    Print it to the console.
    println("Enter the number")
    val inputNmber = readLine()?:""
    val input = inputNmber.toInt()
    val d1 = 34.1
    val result = input * d1
    println("result in ${result}")
    println(result::class.java)


}