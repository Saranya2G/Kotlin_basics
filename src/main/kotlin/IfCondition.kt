fun main(array: Array<String>) {
//    println("Please enter the input is it night or day time in boolean")
//    val input = readLine()?:"true"
//    val night = input.toBoolean()
//    if (night == true){
//        println("Sleep in night time")
//    }else{
//        println("Be active at day time")
//    }

//    println("Enter the fund you have")
//    val userinput = readLine()
//    var clientFunds = userinput?.toInt()?:0
//    val price = 50
//    var clientProducts = 0
//
//        if(clientFunds > price) {
//            clientFunds -= price
//            clientProducts += 1
//            println("You purchased $clientProducts products")
//            println("You have $clientFunds funds")
//        }else{
//            println("You have insufficient funds tp purchase the products")
//
//
//        }

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true
    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Buy cat")
        }
    } else {
        println("Ask petstore get cat")
    }

    //practice

//    println("Do you have keys?")
//    val userInput = readLine()?:""
//    var input = false
//    if(userInput == "yes"){
//        input = true
//    }
//    if(input){
//        println("car has started")
//    }else{
//        println("You don't have key to start the car")
//    }

//    println("Enter the current time only the hour")
//    val usersinput = readLine()?:"0"
//    val hours = usersinput.toInt()
//    if(hours < 12){
//        print("Now the time is $hours AM")
//    }else{
//        if(hours == 12){
//            println("It's $hours AM")
//        }else {
//            println("It's ${hours - 12}PM")
//        }
//
//                }

    //Exercise


    val hasEggs = true
    val hasBacon = false
    val eggprice = 5
    val baconprice = 20
    var total = 0
    if (hasEggs) {
        total += eggprice * 12
        if (hasBacon){
            total += baconprice * 2
    }
}
    println("Total is $total")
}
