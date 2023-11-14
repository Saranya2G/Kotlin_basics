fun main(args:Array<String>){
    var r =10
    calculateCircleArea(r)
    println("calculate area ${calculateCircleArea(r)}")

    val clients = listOf("Anna", "Bob", "William")
    for(client in clients) {
        val greeting = personalisedGreeting(client)
        println(greeting)
    }
    val s = 24
    println("A circle with a radius of $r has an area of${calculateCircleAreas(s)}")
    for (i in 1..3){
        addition(i*1,i*3)
    }
    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))
    for(item in products.keys){
        val finalPrice = addTax(products[item])
        println("$item cost of $finalPrice")
    }

    println("enter the animal name")
    val animalname = readLine()?:""
    val lifespan = getLifeSpan(animalname)
    println("$animalname have $lifespan lifespan")
}

//A function can return a result
fun calculateCircleArea(radius: Int): Double { //Double is they returning double
    val pi = 3.1415
    return pi * radius * radius
}

fun personalisedGreeting(person: String): String {
    val greeting = when (person[0]) {
        'A' -> "Are you ok $person"
        'W' -> "What's up $person"
        else -> "Hi $person"
    }
    return greeting
}

//Return shorthand
fun calculateCircleAreas(radius: Int) = 3.1415 * radius * radius

//practice
//Create a function that receives 2 parameters and returns the
//sum of those parameters.Call the function 3 times and display the result.

fun addition(p1:Int,p2:Int) : Int{
    return p1+p2
}

//Create a function that receives the price of a product, adds 20% tax and returns the result.
//These are the products in your online store.Print out the final price for each product.
//val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))

fun addTax(price:Double?) = price?.times(1.2)

//Exercise
//Create a function that receives the name of an animal, and returns the estimated lifespan.
//cats -> 15
//dogs -> 10
//rabbit -> 12
//everything else -> 20
//Ask the user to input an animal, then print out the estimated lifespan for that animal.

fun getLifeSpan(name: String) : Int{
    val lifespan = when(name){
        "cats" -> 15
        "dogs" -> 10
        "rabbit" -> 12

        else -> 20
    }
    return lifespan
}

