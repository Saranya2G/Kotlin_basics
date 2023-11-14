fun main(args: Array<String>){
    println("Number input something")
    val userInput = readLine()?:""
    println("You wrote ${userInput.toInt() * 5}")

}