fun main(args: Array<String>){
    var onlyEvenNumbers = arrayListOf(2, 8, 4, 7, 6, 9)
    for ( number in onlyEvenNumbers) {
        if (number % 2 != 0)
            continue
        println("Half of $number is ${number /
                2}")
    }
}