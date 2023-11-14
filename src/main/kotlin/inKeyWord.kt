fun main(args: Array<String>){
    val favouritePet = "dogs"
    val availablePets = listOf("dog", "cat", "horse")
    if(favouritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePet is not available")
    }

    println("Enter your fav coffee")
    var coffee = readLine()?:""
    val availableCoffee = listOf("capuccino", "mocha")
    if(coffee !in availableCoffee)
        println("Your coffee is not available")
    else
        println("$coffee is available")

    println("Enter a number")
    val input = readLine()?:"0"
    val number= input.toInt()
    if(number !in 0..9)
        println("Your number is not a single digit")
    }