fun main(args:Array<String>){
val myBox = Box()
    println("Content is ${myBox.contents}")
    myBox.updateContents("Jwellery")
    println("Content is ${myBox.contents}")
}

class Box {

    //A box has a contents variable as a String, and a function
// updateContents that also takes a contents variable.
    // Create a program that updates
// the class variable in the updateContents function.

    var contents = ""

    fun updateContents(contents:String){
        this.contents = contents
    }
}