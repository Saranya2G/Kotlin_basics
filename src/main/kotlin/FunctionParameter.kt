fun main(args: Array<String>){
    val clients = listOf("Anna", "John", "Michelle")
double(12)
    sayHello(clients)
    doubleMessage(5,"5*2=")
    doubleMessage(3)
    }

fun double(number: Int) {
    println("Double of $number is ${number
        * 2}")
}
fun sayHello(people: Collection<String>) {
    for(person in people) {
        println("Hi $person")
    }
}
//parameter have default values
fun doubleMessage(number: Int, message: String = "Double is"){
    println("$message ${number*2}")
}