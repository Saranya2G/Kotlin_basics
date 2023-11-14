import kotlin.math.cos

fun main(args:Array<String>){
    println(multiply(3))
    println(multiply(3, 5))
    cost("coffee",12.23)

    val product = mapOf(Pair("cake",12.22),Pair("chips",11.40))
    cost(product)


}
//Two functions can have the same nameif they have the different numbers or types of parameter
fun multiply( number: Int ) = number * 2
fun multiply( number: Int, multiplier: Int) = number * multiplier

fun sayHello(person: String) {
    println("Hi $person")
}

//fun sayHello(people: Collection<String>) {
//    for (person in people) {
//        println("Hi $person")
//    }
//}

//Exercise
//Create a function that takes a product name and price.
//It adds 20% tax to that product and displays a message saying how much the product costs.
//Overload the function so that it takes a map of products and prices, and does the same thing.
//Call both functions in your program.

fun cost(product: String,price: Double?){
    println("product $product cost is${price?.times(1.2)}")
}
fun cost(products: Map<String,Double>){
    for(product in products.keys){
        cost(product,products[product])

    }
}