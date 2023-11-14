import kotlin.random.Random

val words = listOf("elbow", "writer", "circle", "polish", "bridge", "store", "fang", "scarecrow", "show", "jeans", "wilderness", "attempt", "waxing", "aftermath", "banana", "wrist", "wheel", "spring", "cherries", "nerve")
var word = ""
val guesss = arrayListOf<Char>()
var remainigGuess = 6
var mistakes = 0

fun main(args: Array<String>){
    setupGame()

}
fun setupGame(){
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
    println(word)

    for(i in word.indices)
        guesss.add('_')



    var gameOver = false

    do {
        printGamestatus()
        println("Please enter a letter:")
        val input = readLine()?:""
        if(input.isEmpty()){
            println("This is not a valid input. Please try again")
        }else{
            val letter = input[0].toUpperCase()
            if(word.contains(letter)){
                for(i in word.indices){
                    if(word[i]==letter)
                        guesss[i] = letter

                }
                if(!guesss.contains('_'))
                    gameOver = true
            }else{
                println("That is not part of the word.Please try again")
                remainigGuess--
                mistakes++
                if(mistakes == 6){
                    gameOver = true
                }
            }
        }

    }while (!gameOver)
    if(mistakes == 6){
        printGamestatus()
        println("You lost the game. The word is \n$word")
    }else{
        println("Congratulations!! You win the Game")
        println("The word is \n$word")
    }

}

fun printGamestatus(){
    when(mistakes){
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }
    print("Word: ")
    for (element in guesss)
        print(element)
    println("\nYou have $remainigGuess guesses left")
}
fun print0Mistakes(){
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}
fun print1Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}
fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}