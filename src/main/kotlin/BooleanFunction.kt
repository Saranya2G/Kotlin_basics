fun main(args: Array<String>){
    //A function can be used in a conditional statement if it returns aboolean
//    val animals = arrayListOf<String>()
//    if(animals.isEmpty()) {
//        animals.add("dog")
//    }
//    println(animals)
//
//    // Some functions you might not expect to return a boolean
//    val animal = arrayListOf("cat", "dog")
//    if(animal.add("horse")) {
//        println("Horse was successfully added")
//    }

    //practice
//    val gurstList = setOf("Jhon","Alice","Saml")
//    println("Please enter your name")
//    val guest = readLine()?:""
//    if(guest in gurstList) {
//        println("Hi $guest welcome")
//    }else {
//        println("Your name not in list")
//    }

//    println("How many cat's do you have?")
//    val input = readLine()?:"0"
//    val cats = input.toInt()
//    val howmany = if(cats == 0)
//        "no cats"
//        else if(cats in 1..3)
//        "Few cats"
//    else if(cats in 4..6)
//        "several cats"
//    else
//        "many cats"
//    println(howmany)

//    val animals = arrayListOf<String>("cat","dog")
//    if(animals.isEmpty()){
//        println("Thank you for giving homes to all pets")
//    }else{
//        println("Please come in adopt pet $animals")
//    }
    //Exercise
//    Ask a user to input their age.
//    If they are under 13, they are a child
//    If they are under 18, they are a teen
//    If they are older, they are an adult.
//    Use ranges to print out the correct message.
//    If the age is 0, convert it to 1.

    println("Enter your age")
    val input = readLine()?:"1"
    val age = input.toInt()
    if(age == 0 ) age == 1

    val result = if(age in 1..12)
        "a child"
    else if(age in 13 ..17)
        "They are teen"
    else
        "They are adult"
    println(result)
}