fun main(args: Array<String>){
    val animals = arrayListOf("chitta","elephant","zebra","tiger")
    animals.set(1,"lion")
    println(animals)
    val subAnimals = animals.subList(0,2)
    println(subAnimals)
    println(subAnimals::class.java)
    animals.clear()
    println(animals)
    println(animals.isEmpty())

    //practiec
    val ingredients = arrayListOf("Chicken","Egg","Mozzaralla","Pepper")
    ingredients.set(2,"blue cheese")
    println(ingredients)

}