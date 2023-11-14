import java.util.*

fun main(args: Array<String>){
    var myPetName = "Fluffy"
    println(myPetName.length)

    var myName = "kathrine"
    println(myName.capitalize())

    var myAnimalName = "Crocodile"
    println(myAnimalName.decapitalize());

    var trimExample = "   This   is  the  Example for trime       "
    println(trimExample.trim())

    println(myPetName.get(4))
    println(myPetName[4])

    println(myAnimalName.substring(3))
    println(myAnimalName.substring(3,6))

    println(myPetName.uppercase(Locale.getDefault()))

    println(myPetName.plus(myName))

    val dogName = "Puppy"
    println("The dog name is $dogName")
    println("Sum of ${2+2}")

    //Exercise
    val client = "Mary"
    val products = 3
    val price = 30
    println("Hello $client you need to pay the total amount is  ${products * price}")

    //Any varibale can be coverted into string

    val cats = 12
    val catGroup  = cats.toString()
    println(cats::class.java)
    println(catGroup::class.java)

    val pi = 14.227
    val piValue = pi.toString()
    println(pi::class.java)
    println(piValue::class.java)


}