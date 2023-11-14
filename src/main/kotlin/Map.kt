fun main(args: Array<String>){
    val count = mapOf(Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"))
    println(count)

    val count2 = mapOf<Int,String>()
    println(count2)

    println(count.get(1))
    println(count.keys)
    println(count.values)

    //practice
    val customers = mapOf(Pair("Jhon",1),Pair("Alice",5),Pair("Bob",3))
    println("Is alice is customer ${customers.containsKey("Alice")}")
    println("how many products alice buy ${customers.get("Alice")}")
    println("is michel is a customer ${customers.containsKey("Michael")}")

}