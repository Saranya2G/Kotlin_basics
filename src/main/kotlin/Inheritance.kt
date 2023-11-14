fun main(args:Array<String>){

    val corgi = Corgi()
    corgi.dogsize = 10
    println(corgi.dogsize)
    corgi.bark()
    corgi.play()

}


open class Dog {
    var dogsize: Int = 0
    fun bark() {
        println("Bark")
    }
    fun play() {
        println("Playing")
    }
}

class Corgi: Dog(){

}