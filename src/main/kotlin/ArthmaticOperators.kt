fun main(args: Array<String>){
    val result = 2+2
    println(result)
    println("Hi"  + " Jhon")

    println(4-2)
    println(4*2)
    println(4/2)
    println(4%2)

    var pen = 12
    pen++
    println("I have $pen")

    pen--
    println("Decrement $pen")

    var dogs = 3
    println("I have dog a ${dogs++}") //not working The reason for that is the plus plus operator, if it is placed after the variable will give us a a result after the variable is used.
    println("I have dog b $dogs") //working
    println("I have dog c ${++dogs}")
}