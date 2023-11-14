fun main(args: Array<String>){
    val number = setOf(1,2,3,4,5)
    println(number.size)
    number.contains(1)
    number.contains(11)
    val newNumbers = setOf(11,22,33,44)
    println(number.containsAll(newNumbers))
    println(number.isEmpty())

    //practice

    val numbersGroup = setOf(2,3,5,7,11,13,17,19,23,29)
    println("Is the 21 is prime number ? ${numbersGroup.contains(21)}")
    println(numbersGroup)
    println("Is the 13 is prime number ? ${numbersGroup.contains(13)}")

}