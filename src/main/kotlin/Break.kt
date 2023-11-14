fun main(args: Array<String>){
    var onlyEvenNumbers = arrayListOf(2, 8, 4, 7, 6, 9)
    for ( number in onlyEvenNumbers) {
        if (number % 2 != 0)
            break
        println("Half of $number is ${number /
                2}")
    }

    //Exercise
//    A group of young people are going to a nightclub.
//    Design a program that accepts user ages.
//    The program displays a welcome message for each user.
//    If it receives an age lower than 18, it prints a message that this client is not allowed.
//    If it receives the word “stop”, the program ends

    while (true){
        println("Please enter your age")
        val input = readLine()?:""
        if(input == "stop")
            break
        val age = input.toInt()
        if(age < 18){
            println("Sorry you can't go in")
            continue
        }
        println("Welcome to the club")
    }
}