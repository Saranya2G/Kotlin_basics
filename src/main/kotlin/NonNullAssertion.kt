fun main(args: Array<String>){
    var catName: String? = null
    catName = "Jenni"
    println(catName!!.length)

    //practice
    println("Enter your input")
    var userInput = readLine()
    println(userInput?:"Hello, team")

    println("Enter the number")
    var numberInput = readLine()
    var number = numberInput?.toInt()
    println("The number multiplied by 5 ${number!! * (5)}")

    //Exercise
//    A product costs 29.99.
//    Ask a user at the console how many products they want to buy.
//    If the read value is null, use the default of one.
//    Print the total of the purchase.

    println("Enter the number products you want")
    var productCosts = 29.99
    val userInputs = readLine()
    val inputs = userInputs?.toInt()?:12
    println("Total of the purchase is ${inputs * productCosts}")


}