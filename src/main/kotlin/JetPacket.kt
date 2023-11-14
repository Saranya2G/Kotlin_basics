fun main(args: Array<String>){

    val jetPacket = JetPacket()
    jetPacket.burn(10)
    println("user height is ${jetPacket.userHeight}")
    jetPacket.stop(12)
    println("user height is ${jetPacket.userHeight}")
    jetPacket.burn(5)
    println("user height is ${jetPacket.userHeight}")
    jetPacket.stop(8)
    println("user height is ${jetPacket.userHeight}")


}
class JetPacket {
//    A jetpack can make a user fly.
//    It achieves this with two operations:
//    ●burn(number of seconds) - which elevates the user.
//    ●stop(number of seconds) - which descends the user.
//    Assume burn will elevate the user by 1 meter per second.
//    Assume stop will descend the user by 3 meters per second.
//    Create a class jetpack that stores a variable userHeight, and twofunctions, burn and stop, that alter the height.
//    Create an object, call its methods and print out some results.
//    Enforce that a user cannot go below 0 in height.

    var userHeight = 0

    fun burn(seconds: Int){
        println("Burinig seconds $seconds")
        userHeight += seconds
    }
    fun stop(seconds: Int){
        println("stopping for seconds $seconds")

        userHeight -= seconds
        if(userHeight < 0){
            userHeight = 0
        }
    }
}