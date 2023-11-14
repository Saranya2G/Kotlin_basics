
fun main(args: Array<String>){
    val count = mapOf(Pair(1,"one"),Pair(2,"two"),Pair(3,"three"))
    println(count.size)
    println(count.containsKey(1))
    println(count.containsValue("one"))
    println(count.isEmpty())
    println(count.isNotEmpty())
}