fun main(args: Array<String>){
//    println("Input something")
//    val userInput = readLine()
//    println("You wrote $userInput")

    println("Enter your birthday year")

    val birthdayYear = readLine()?:""
    val birthYear = birthdayYear.toInt()
    val currentYear = 2023 - birthYear
    println("Birthday year ${currentYear - 1} or $currentYear")
}






