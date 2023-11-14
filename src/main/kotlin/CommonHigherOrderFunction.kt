fun main(args:Array<String>){
    val clients = listOf("Anna", "Bob", "Carol", "David")
    clients.forEach { println("Hello $it") }

    println("_____________________")
    val client = listOf("Anna", "Bob", "Carol", "David")
    client.filter { it.length < 5}
        .forEach { println("Hello $it") }
    println("_____________________")

    val clients1 = listOf("Anna", "Bob", "Carol", "David")
    val sizes = clients1.map { it.length }
    println(sizes)

    println("_____________________")

    val clients2 = listOf("Anna", "Bob", "Carol", "David")
    val sorted = clients2.sortedBy { it.length }
    println(sorted)
    println("_____________________")

    val clients3 = listOf("Anna", "Bob", "Carol", "David")
    val max = clients3.maxBy { it.length }
    println(max)
    println("_____________________")

    val clients4 = listOf("Anna", "Bob", "Carol", "David")
    val min = clients4.minBy { it.length }
    println(min)

    println("_____________________")

    //Exercise
//    Given a collection of random integers.
//    If a number is odd, double it.
//    If a number is even, half it.
//    Print out a subset of the collection that has numbers greater than 25

    val integers = listOf(1,2,56,77,13,112)
    val subset = integers.map {
        if(it % 2 ==0)
            it/2
        else
            it*2
    }
        .filter { it>25 }
    println(subset)
}

