fun main(args: Array<String>){
    var action: String = ""
    val animal = "cat"
    when
            ( animal ) {
            "cat" -> action = "pet it"
            "dog" -> action = "feed it"
        else -> action = "google it"
    }
    println("When you meet $animal you should $action")

    val month = "January"
    val days = when(month) {
            "January","May","April" -> 31
            "February" -> 28
            "March" -> 31
        else -> 30
    }
    println(days)
}