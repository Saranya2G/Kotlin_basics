fun main(args: Array<String>){
    val matrixSize = 10
    for(i in 1..matrixSize) {
        for (j in 1..matrixSize) {
            if (i == j)
                print("diagonal\t")
            else
                print("$i, $j\t\t")
        }
        println()
    }
    //Praciece
//    Ask the user to input a number.
//    Call it maxValue.
//    Print out every number smaller than maxValue that is divisible by 7, indescending order.

    println("enter the number")
    val input = readLine()?:"0"
    val maxValue = input.toInt()
    for(i in maxValue downTo 0){
        if(i % 7 == 0){
            println(i)
        }
    }
    for(i in 1..10){
        for(j in 1..i){
            print("😀")
        }
        println()
    }

    //Exercise
//    Ask the user for a number.
//    Print out a square matrix of the size indicated by the number.
//    Inside each cell, print out 1 emoji
//    😀 If the row*column is divisible by 3
//    🤨 If the row*column % 3 is 1
//    😱 If the row*column % 3 is 2
    println("please enter the matrix size")
    val inputs = readLine()?:""
    val number = inputs.toInt()
    for(i in 1..number){
        for (j in 1..number){
          when(i * j % 3){
              0 -> print("\uD83D\uDE00\t")
              1 -> print("\uD83E\uDD28\t")
              2 -> print("\uD83D\uDE31\t")
          }
        }
        println()
    }
    }