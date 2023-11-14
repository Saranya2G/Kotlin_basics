
fun main(args: Array<String>){
//    println("Enter the input")
//    val test = readLine()
//    try {
//
//        println(test?.toInt())
//    }catch (e: Exception){
//        e.printStackTrace()
//        println("An exception occurred \n ${e.localizedMessage}")
//
//    }
//    finally {
//        println("The execution has completed")
//    }

    //practice
    println("Enter the input")
    val input = readLine()
    try{
        var inputs = input?.toInt()
        println(inputs?.times(5))
    }catch (e: Exception){
        println("Not a valid input")
    }

    println("Enter the kilometer ran today")
    val kilometerInput = readLine()
    try {
        val miles = 0.62
        var kilomInput = kilometerInput?.toDouble()
        var ranToday = kilomInput?.times(miles)
        println("coverting value to miles $ranToday")
    }catch (e: Exception){
        e.printStackTrace()
        println("Not valid inputs")
    }

    //Exercise
//    A customer will tell the program what product they want to buy.
//    Then, they will tell the program how many products they require.
//    Assume the price of the product is 9.99
//    What is the total?
//    Handle any exceptions that might occur.
    println("what product they want to buy")
    val product = readLine()
    println("how many products they require")
    val NoOfProducts = readLine()
    try {
        val countOfProducts = NoOfProducts?.toInt()
        val price = 9.99
        println("Total $product is cost of ${countOfProducts?.times(price)}")
    }catch (e: Exception){
        e.printStackTrace()
        println("cannot read the amount")
    }finally {
        println("Execution has completed")
    }




}