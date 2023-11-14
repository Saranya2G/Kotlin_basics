fun main(args: Array<String>){
    val number = hashSetOf(1,2,5,3,4,null)
    val newNumber = hashSetOf(1,2,5,78,99)
    //return the common numbers in intersection of 2 sets
    number.retainAll(newNumber)
    println(number)
    number.clear()
    println(number)
    println(number.isEmpty())

    //Exercise
    val myDrinks = hashSetOf("water","coke","beer","orange juice")
    val theirDrinks = hashSetOf("water","orange juice","pineapple juice","milk")
    myDrinks.retainAll(theirDrinks)
    println("Drinks we both enjoy is $myDrinks")

    //Exercise
//    Your company has very strict dress code. Only certain color clothes can be worn in the office.
//    val acceptedColors = hashSetOf(“white”, “black”, “grey”)
//    You have certain colors in your wardrobe.
//    val myColors = hashSetOf(“blue”, “red”, “black”, “green”)
//    What color clothes can you wear.
//    Your company has added another color, “red” to their list. What options do you have now?

    val acceptedColors = hashSetOf("white", "black", "grey")
    println(acceptedColors)
    val myColors = hashSetOf("blue", "red", "black", "green")
    acceptedColors.retainAll(myColors)
    println("I can wear only $acceptedColors")

    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println("Now I can wear $acceptedColors")





}