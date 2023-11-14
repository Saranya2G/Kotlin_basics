fun main(args: Array<String>){
    var animal = "cat"
    var action: String
    when ( animal ) {
            "cat" -> {
        action = "pet it"
    }
            "dog" -> {
        action = "feed it"
    }
        else -> {
            action = "google it"
        }
    }
    println("when you meent $animal you do $action")

    var result = ""
    val number = 2345
    when(number % 2){
        0 -> result = "Number is even"
        1 -> result = "Number is odd"
    }
    println(result)

    //practice
//    Assume that 3 meals a day is the recommended amount.
//    Ask the user to input the number of meals they have every day.
//    Based on the input, print out a message that encourages the user to increase or
//    decrease the number of meals they have.


    println("How many meals do you have?")
    val input = readLine()?:""
    val meals = input.toInt()
    when(meals){
        in 0..2 -> println("You should eat more")
        3 -> println("That's perfect")
        else -> println("You should eat less")
    }

//    Assuming, based on the hour of the day
//    6 to 11->morning
//    12 to 14->noon
//    15 to 17->afternoon
//    18 to 21->evening
//    22 to 5->night
//    Ask the user to input the current hour.Print out a message to specify the time of day.
    println("Enter the current time")
    val userInput = readLine()?:""
    var hour = userInput.toInt()
    if(hour > 23) hour = 23
    val timeOfTheDay = when(hour){
        in(6 ..11) -> "Morning"
        in(12..14) -> "Noon"
        in(15..17) -> "Afternoon"
        in(18..21) -> "evening"
        else -> {
            "night"
        }
    }
    println("You're in $timeOfTheDay")

    //Exercise
//    Ask the user to input their name.
//    Based on the first letter of their name, print out a personalised greeting
//    for the first 3 letters of the alphabet,
//    a different one for the next 3 letters,
//    and a third message for the rest
    println("Enter your name")
    val userinput = readLine()?:""
    when(userinput[0]){
        'A', 'B', 'C' -> println("Hello, $userinput welcome")
        in 'D'..'F' -> println("Hi $userinput how are you")
        else -> println("Hi")
    }

}