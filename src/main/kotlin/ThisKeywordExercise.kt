fun main(args: Array<String>){
    var tab = NewTable()
    tab.printInfo()
    tab.updateDimension(10,20)
    tab.printInfo()

}
class NewTable {
    //A table allows the user to adjust the height and size,
    // through a function that also takes the parameters height and size.
    //Create the class, variable, function, instantiate it and call the function to adjust height and size.
    var height = 120
    var size = 200

    fun updateDimension(height:Int,size:Int){
        this.height = height
        this.size = size
    }
    fun printInfo(){
        println("The table height is $height and size is $size")
    }
}