fun main(args: Array<String>){
    // arraylist is mutable we can add or remove the elements
    val colors = arrayListOf("pink","orange","blue","violet")
    println(colors)
    colors.add("black")
    println(colors)
    // we can add another collection
    var pastelColors = arrayListOf("light green","light pink")
    colors.addAll(pastelColors)
    println(colors)
    colors.remove("orange")
    println(colors)
    colors.removeAll(pastelColors)
    println(colors)
    colors.removeAt(1)
    println(colors)

    //to create empty array list
    val noColors = arrayListOf<String>()
    println(noColors)

    val customerList = arrayListOf("sam","ram","bala","pranav")
    println(customerList)
    val addingCustomer = "arnav"
    customerList.add(addingCustomer)
    println(customerList)
    val removingCutomer = "same"
    customerList.remove(removingCutomer)
    println(customerList)

    //Exercise
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)
    println(items)



}