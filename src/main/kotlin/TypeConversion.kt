fun main(args: Array<String>){
    val cats = 12.12
    val catsGroup = cats.toInt()
    println(cats::class.java)
    println(catsGroup::class.java)
    println(catsGroup)

    //If you converted to a smaller type, some information might be lost or corrupted
    val pepople = 4500000000
    val pepoleGroup = pepople.toInt()
    println(pepople::class.java)
    println(pepoleGroup::class.java)
    println(pepoleGroup)

    //Exercise
    println("Enter a input number")
    val userInput = readLine()?:""
    val input = userInput.toDouble()
    var pi = 4.14159
    var result = input * pi
    println(result::class.java)
    println("This is the result $result")

}