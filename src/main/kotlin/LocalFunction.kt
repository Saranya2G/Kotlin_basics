fun main(args:Array<String>){
    listAnimals( )
    //listOneAnimal("dog")// not able to access the inside function error
    //A local function is a function inside a function
}
fun listAnimals( ) {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }
    val myAnimals =arrayListOf("cat", "dog", "cow","horse")
    for(animal in myAnimals) {
        listOneAnimal(animal)
        userDetails()
    }
}

//Exercise
//Create a function that asks the user for a name until an empty string is introduced.
//Create a local function that takes a name and prints a greeting.
//For each name introduced, print out a greeting.

fun userDetails(){
    fun printUserDetails(name:String){
       println("Hi $name")

        }
    while(true){
        println("Enter your name")
        val username = readLine()?:""
        if(username == "")
            break
        printUserDetails(username)
    }
    }

