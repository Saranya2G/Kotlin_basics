fun main(args: Array<String>){

  val names = arrayListOf("Sam","Alice")
    sayHello(names) {allnames: String -> println("Heloo $allnames") }
    //A HOF is a function that takes another function as a parameter

    val numbers = arrayListOf(1,23,43,13,78)
    println(numbers)
    val newNumber = update(numbers){number -> number / 10 }
    println(newNumber)
}

fun sayHello(names: ArrayList<String>,doSomething: (String) -> Unit){
    for(name in names){
        doSomething(name)
    }

    val client = arrayListOf("Michele","Billa")
    val message = clientNames(client) {name -> "Hello $name" }
    println(message)

    for(i in 0..client.size-1){
        println("Message for ${client[i]}")
        println(message[i])
        println()
    }

}

//practiec
//Create a Higher Order Function that takes a mutable collection of integers and a lambda function.
//It then applies the lambda function to every even element of that collection.
//Create a lambda function that when applies to an integer, it returns that integer divided by 10.
//Call the HOF using your lambda and display the result.

fun update(number: ArrayList<Int>, lbd: (Int)->Int): ArrayList<Int>{
    for(i in 0..number.size-1){
        if(number[i]%2 == 0)
            number[i] = lbd(number[i])

    }
 return number
}

//Exercise
//Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.
// It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.
//Create a lambda expression that takes a client name String and returns a personalised message.
//Call the HOF and print out the result.

fun clientNames(clients: Collection<String>, getMessage: (String) -> String) : ArrayList<String> {
val message = arrayListOf<String>()
    for(client in clients){
        message.add(getMessage(client))
    }
return message
}