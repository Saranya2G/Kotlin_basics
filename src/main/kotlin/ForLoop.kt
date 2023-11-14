fun main(args: Array<String>){
    val animals = arrayListOf("cat", "dog", "mouse", "bear")
    for ( animal in animals ) {
        println("Feed the $animal")
    }
    for(i in 1..12) {
        val month = when(i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> ""
        }
        println("Month #$i is called $month")
    }

    //practice
    //Print a greeting message 10 times
    for (j in 1..10){
        println("Hello, how are you")
    }
    //Add up all the numbers from 1 to 100

    var total = 0
    for(k in 1..100){
        total += k
    }
    println(total)

//    An online store has the following map of customers and number of purchases.
//    For each customer, print out a message telling them how many purchases they made.
//    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna",6))

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna",6))
    for(customerName in customers.keys){
        val purchase = customers[customerName]
        println("$customerName you purchase $purchase items")
    }

    //Exercise
//    Ask the user to input a year. For each month of that year, print out how many days there are.
//    Make sure you count leap years.
//    Assume a leap year is a year that is divisible by 4.
//    *there are additional rules for leap years, but we will ignore those in this exercise

    println("Enter the year")
    val userinput = readLine()?:""
    val input = userinput.toInt()
    for(i in 1..12){
        val message = when(i){
            1 -> "January have 31 days"
            2 -> if(input % 4 == 0 ) "Febraury have 29 days" else "Feb have 28 days"
            3 -> "March have 30 days"
            4 -> "April have 30 days"
            else -> {
""
            }
        }
        println(message)
    }
    for ( i in 1..3 ) {
        println("Strike $i")
    }
    println("You’re out!")

    //Ranges can be ascending1..10
    // or descending10 downTo 0
    // can skip steps10 downTo 0 step 3
    for(i in 10 downTo 1){
        println("$i Hello")
    }
    for (i in 10 downTo 0) {
        println(i)
        when(i) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }
    // skip 3 between the 10 to 0 like 10-3 =7
    for (i in 10 downTo 0 step 3) {
        println(i)
    }
}