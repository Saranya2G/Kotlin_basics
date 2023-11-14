fun main(args: Array<String>){
    val dozen = 12
    val months = dozen
    println(months)

    val username = "Lucy"
    val greetings = "Hi, $username"
    println(greetings)

    //Exercise
    println("Enter your amount")
    val userInput = readLine()?:""
    val input = userInput.toDouble()
    var interest = 5.5
    var totalAmount = input * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
    println("Your total amount after 5 years is ${totalAmount}")

}