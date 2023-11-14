fun main(args:Array<String>){
    syaHello("Alice","bob","sam","ram")
    //vararg - Variable number of parameters (arguments)
    //more then one parameter more then one argument passed in this function
    printHello(3,"marry","maya")
}



fun syaHello(vararg names: String){
    for (name in names) {
        print("Hello $name")
    }
}
//Exercise
//Create a function that takes an integer variable “count” and a variable number of client names.
//Print out “count” hello messages for each client.
//
//i.e. if count = 3, print out 3 hello messages for each client.

fun printHello(count:Int,vararg names: String){
    for (name in names){
        for (i in 1..count)    {

    println("Hello $name - ")
}
    }
    println()
}