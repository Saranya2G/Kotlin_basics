fun main(args: Array<String>){
//    var puzzlePieces = 20
//    var piecesPlaced = 0
//    do {
//// place piece
//        piecesPlaced ++
//        println(piecesPlaced)
//    } while ( piecesPlaced < puzzlePieces )
//
//    //practice
////    Ask the user to input a number multiple times, until they input a number larger than 100
//    var finished = false
//    do {
//        println("Enter the number")
//        val inputs = readLine()?:""
//        var number = inputs.toInt()
//        if(number > 100){
//            println("Thanks")
//            finished = true
//        }else{
//            println("$number is greater than 100 try again")
//        }
//    }while (!finished)

    //practice
//    Ask the user to input a number.If the factorial of that number is less than 3 000 000, ask them to inputanother number and repeat the process.

//    var finish = false
//    do {
//        println("Enter the number")
//        val inputs = readLine()?:""
//        var number = inputs.toInt()
//        var factorial = 1
//        var i = 1
//        while (i <= number){
//            factorial *= 1
//            i++
//        }
//       if(factorial < 3000000){
//           println("$number = $factorial is smaller than 3000000, try again")
//       }else{
//           println("$number! = $factorial")
//           finish = true
//       }
//    }while (!finish)

    //Exercise
//    You have a set of usernames
//    val usernames = hashSetOf(“john”, “bob”, “alice”)
//    Ask the user to choose their username. If their username is taken, print out a message and ask again.
//    Add the username to the set.

    val usernames = hashSetOf("john", "bob", "alice")
    var finis = false
    do {
        println("Enter the username")
        var username = readLine()?:""
        if(usernames.contains(username)){
            println("$username is taken please try again")
        }else{
            println("$username is new user name")
            finis = true
            usernames.add(username)
        }

    }while (!finis)
    println(usernames)


}