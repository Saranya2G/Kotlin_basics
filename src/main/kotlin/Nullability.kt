fun main(args: Array<String>){
    val hisName: String = "Lilly"
    val herName: String? = null
    println(hisName)
    println(herName)

    var catName: String? = "julie"
    catName = null

//    compilation error
//    var dogName: String = "puppy"
//    dogName = null

    var catsName: String? = "whity"
    println( catsName?.length) // returns either null if catName is null ot the return actual string lenght
    catsName = null
    println(catsName?.length)

//    practice

    var x: String? = "Apples"
    println(x?.substring(3,6))

    var y: Double? = 13.94
    var result = y?.times(6)
    var flores = result?.toFloat()
    println(flores)

   println("Enter your name")
    var userInput = readLine()
    println("Length of the name ${userInput?.length}")

    //Exercise
//    Read a number from the console and convert it to Double.
//    Multiply it by 7, and convert the result into a string.
//    Print the length of that string to the console.
    println("Enter you input")
    var inputFromUser = readLine()
    var input = inputFromUser?.toDouble()
    var res = input?.times(7)?.toString()
    println("Lenght of the $res is ${res?.length}")


}
