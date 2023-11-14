import java.util.HashSet

fun main(args: Array<String>){
    val number = hashSetOf(1,2,3,4)
    println(number)
    val number1 = hashSetOf<Int>()
    println(number1)
    number.add(5)
    println(number)
    val newNumbers = hashSetOf(22,11,44,55)
    number.addAll(newNumbers)
    println(number)
    number.remove(55)
    println(number)

    val removeset = hashSetOf(22,11)
    number.removeAll(removeset)
    println(number)

//practice
    val colors = hashSetOf<String>()
    println(colors)
    val addColors = setOf("red","blue","pink")
    colors.addAll(addColors)
    println(colors)
    colors.remove("red")
    println(colors)

    val deskObjects = hashSetOf("water bottle","buddha","tea cup","wired headphoene")
    val removedObjects = setOf("tea cup","wired headphoene")
    deskObjects.removeAll(removedObjects)
    println(deskObjects)

    //Exercise
//    You have a list of customers for your online store.
//    A new customer has joined.
//    Print the list of customers.
//    A customer has chosen to leave.
//    Print the list of customers.
    val onlineCustomer = hashSetOf("Sam","michele","jovi","Bob")
    println("Enter the customer to add")
    val userinput = readLine()?:""
    onlineCustomer.add(userinput)
    println(onlineCustomer)
    println("Enter the customer to leave")
    val userinputs = readLine()?:""
    onlineCustomer.remove(userinputs)
    println(onlineCustomer)
}