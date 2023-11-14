fun main(args: Array<String>){
//    println("Enter the animal ")
//    val animal = readLine()?:"cat"
//    val action = if ( animal == "dog" ) {
//        "pet it"
//    } else if (animal == "cat") {
//        "feed it"
//    } else if (animal == "crocodile") {
//        "run away"
//    } else {
//        "google it"
//    }
//    println(action)

//    val response = 404
//    val message = if(response / 100 == 1){
//        "Information response"
//    }else if(response / 100 == 2){
//        "Success"
//    }else if(response / 100 == 3){
//        "Redirect"
//    }else if(response / 100 == 4){
//        "Clienterror"
//    }else{
//        "Servererror"
//    }
//    println(message)

    //exercise
//    You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.
//    Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.
//    A -> 90 to 100
//    B -> 80 to 89
//    C -> 70 to 79
//    D -> 60 to 69
//    E -> 50 to 59
//    F -> everything else
    println("Input a number 1 to 100")
    val gradeinput = readLine()?:""
    val studentgrade = gradeinput.toInt()
    if(studentgrade > 100){
        println("wrong input")
    }else {
        val grade = if (studentgrade >= 90) {
            "A"
        } else if (studentgrade >= 80) {
            "B"
        } else if (studentgrade >= 70) {
            "C"
        } else if (studentgrade >= 60) {
            "D"
        } else if (studentgrade >= 50) {
            "E"
        } else {
            "F"
        }
        println(grade)
    }
}