fun main(args: Array<String>){
    // result is int type because we need the larger type to store information of two those operation of two those varibales
    val a: Short = 2
    val b: Int = 4
    val result = a * b
    println(result::class.java)

    val x: Long = 12642235
    val y: Float = 12F
    val results = x/y
    println(results::class.java)

    val c: Float = 14F
    val d: Double = 12.22
    val res = c * d
    println(res::class.java)
}