fun main(args: Array<String>){
    val colors = listOf("blue","red","yellow")
    println(colors)
    //if we create empty list we must specify the element type
    val colors2 = listOf<String>()
    println(colors2)
    //list can contain duplicate elements
    val colors3 = listOf("blue","yellow","blue","red")
    println(colors3)
    //list can contain null
    val colors4 = listOf("pink","black","while",null,"peach")
    println(colors4)

    //we can access the element by using index
    println(colors3[0])
    println(colors3.get(1))
    //retrive the size of the list
    println(colors3.size)

    //practice
    val animalList = listOf("elephant","zebra","chitta")
    println(animalList.size)
    println(animalList[1])
}