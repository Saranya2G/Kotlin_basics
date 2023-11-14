
fun main(args:Array<String>){
    val carol = Daughter("french" )
    println(carol.hairColor)
// brown
    carol.say("Hi")

    val parakeet = Parakeet()
    parakeet.fly()

    val son = Son()
    son.printPersonName()
}


    open class Mom(nativeTongue: String) {
        open val hairColor = "brown"
        val eyeColor = "blue"
        open fun say(message: String) {
            println("mom says $message")
        }
    }

    class Daughter(nativeTongue: String):Mom(nativeTongue){
        override val hairColor = "Blue"
        override fun say(message: String) {
            println("Daughter says $message")
            super.say(message)
            println("Mother's hair color ${super.hairColor}")
        }

    }
//practice
//A class bird has a color and a flight speed.
//It has a fly method that prints out some flight information.
//A parakeet is a bird that has a different color and speed.
//Its fly method prints out the flight information, but also that of the average bird.
//Create a parakeet object and print out its flight information.

open class Bird{
    open var birdColor = "purple"
    open var flightSpeed = 10
    open fun fly(){
        println("A bird $birdColor can up to fly spped $flightSpeed")
    }
}
class Parakeet:Bird(){
override var birdColor = "Green"
    override var flightSpeed = 20
    override fun fly() {
        super.fly()
        println("A bird ${super.birdColor} and fly up to ${super.flightSpeed}")
    }
}

//Exercise
//A class Father has a first name and last name. It also has a function that prints out the person’s name.
//A class Son inherits from Father and overrides the first name.It also overrides the message function,
//which now prints out both the name of the person, and the name of the father.
//Implement this structure in a program.

open class Father{
    open var firstName = "Alice"
    open var lastName = "bob"

    open fun printPersonName(){
        println("The name is $firstName and $lastName")
    }
}

class Son:Father(){
    override var firstName = "Saranya"
    override fun printPersonName() {
        super.printPersonName()
        println("A personame ${super.firstName} and ${super.lastName}")
    }

}