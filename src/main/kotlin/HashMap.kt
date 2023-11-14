fun main(args: Array<String>){
    val count = hashMapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
    count.put(4,"four")
    println(count)

    val countMore = hashMapOf(Pair(5,"five"),Pair(6,"six"))
    count.putAll(countMore)
    println(count)

    count.remove(2)
    println(count)

    count.replace(3,"THREE")
    println(count)

    count.clear()
    println(count)

    //practice

    var counts = hashMapOf(Pair(1,"un"),Pair(2,"deux"),Pair(3,"trois"))
    println(counts.get(2))
    println(counts.get(3))
    counts.put(4,"quatre")
    println(counts)

    //Exercise
//    You manage an amusement park, and you have a map that stores dates and attendance.
//    var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))
//    Add a value for 26 Sept.
//    How many people attended in total on 25 and 26 Sept?
//    Is data for 22 Sept available?
    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept",2001)
    val peopoleOn25 = attendance["25 Sept"]?:0 //we provide default value in case of value is not present using elvis operator
    val peopoleOn26 = attendance["26 Sept"]?:0
    println("How many people attended in total on 25 Sept and 26 Sept? ${peopoleOn25 + peopoleOn26}")
    println("Is data for 22 Sept available? ${attendance.containsKey("22 Sept")}")





}