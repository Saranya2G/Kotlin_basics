fun main(args: Array<String>){
    //implicit varibale, kotlin decides the most appropriate variable typr based on the value provided
    val cats = 2
    val price = 14.50
    println(price::class.java)

    // Explicit varibale, we instruct the kotlin to assign a different type to our varibles
    val dogs:Double = 12.0
    println(dogs::class.java)
    val animals: Short = 12
    println(animals::class.java)
    val veggies: Int = 10
    println(veggies::class.java)
    val life = 1222L
    println(life::class.java)
}