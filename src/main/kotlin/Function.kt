fun main(args: Array<String>){
    for (i in 1..3) {
        //sayHello()
        askDetails()

//        var i = 5
//        do {
//            printAlphabet()
//            i--
//        } while (i > 0)
    }
}
fun sayHello(s: String, s1: String, s2: String) {
    println("Hello everyone")
}
fun printAlphabet() {
    println("a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, r, s, t, u, v, w, x, y, z")
}
//Exercise
//Design a function that asks for a user’s name. Then it asks for a user’s birth year.
//Finally, it prints out a message saying the user’s name and age.
//Call the function 3 times.

fun askDetails(){
    println("Please enter your name")
    val name = readLine()?:""
    println("Please enter your birth year")
    val input = readLine()?:""
    val birthYear = input.toInt()
    println("$name is ${2019-birthYear-1} or ${2019-birthYear} years old")



}