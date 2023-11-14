fun main(args: Array<String>){
    val isDay = true
    val isEvening = true
    println(isDay && isEvening)

    println(false || false)

    val isNoght = !isDay
    println(isNoght)

//   Question:
//    A farmer has 3 cows, of which only one produces milk
//    He has two children
//    He is trying to apply for funding. The requirements are
//    You must have no more than 5 animals
//    Animals must produce something that can be sold
//    Regardless of the other conditions, funding will be approved if the family has 3 or more members
//    Does the farmer receive the funding?

    //Exercise
    val cows = 3
    val produceMilkCows = 1
    val children = 2
    val fundingAnimals = ((cows <= 5) && (produceMilkCows > 0)) || (children + 1 >= 3)
    println("Will the former get funding? $fundingAnimals")
}