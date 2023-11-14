fun main(args: Array<String>){
    var puzzlePieces = 20
    var piecesPlaced = 0
    while ( piecesPlaced < puzzlePieces ) {
// place piece
        piecesPlaced ++
        println(piecesPlaced)
    }
    //practiec
//Print out a greeting message 10 times.
    var i = 0
    while(i<10){
        i++
        println("Hello")
    }

//    You have 5 cats.
//    Design a program that prints out a hello message for each cat, using a while loop.
//    var cats = listOf(“Tigger”, “Smokey”, “Sassy”, “Patch”, “Sammy”)
    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var index = 0
    while(index < cats.size){
        println("Hello ${cats[index]}")
        index++
    }
//    Ask the user to input an integer.
//    Calculate the factorial of that integer.* The factorial of a number n is1 * 2 * 3 * … * n

    println("Enter the number input")
    val userInput = readLine()?:""
    val numberInput = userInput.toInt()
    var k = 1
    var result = 1
    while (k <= numberInput){
        result *= k
        k++
    }
    println("$numberInput! is $result")

    //Exercise
//    Ask the user to input a large integer.
//    Print out all the numbers that are divisible by 7, that are less than the user’s number.

    println("Enter the large integer")
    val inputInt = readLine()?:""
    val inputs = inputInt.toInt()
    var l = 0
    while(l < inputs) {
        if (l % 7 == 0)
            println("$l divisable by 7")
        l++
    }

}