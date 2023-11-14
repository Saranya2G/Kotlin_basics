fun main(args: Array<String>){
    val colors = listOf("pink","yellow","white","black","green","orange")
    println(colors.size)
    println(colors.contains("pink"))
    println(colors.contains("peach"))

    val newColors = listOf("orange","green","pastel pink")
    println(colors.containsAll(newColors))
    println(colors.lastIndexOf("green"))
    println(colors.indexOf("white"))

    //practice
    val winners = listOf("Usain","Jhon","Michale","Alex","Bob")
    println(winners.indexOf("Michale")+1)

    val needColor = listOf("red","bule","green")
    val availableColors = listOf("red","blue")
    println(availableColors.containsAll(needColor))

    //Exercise
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda")
    println(animals)
    animals.removeAt(0)
    println(animals)
    val hasAllAnimals = arrayListOf("elephant","giraffes")
    println(animals.containsAll(hasAllAnimals))

}
