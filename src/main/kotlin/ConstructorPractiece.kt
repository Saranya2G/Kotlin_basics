fun main(args:Array<String>){
    var table1 = Tables()
    var table2 = Tables(23)
    var table3 = Tables(12,23)

    table1.printInfo()
    table2.printInfo()
    table3.printInfo()


}

class Tables {

//    Create a class Table that has the variables legs and height.
//    Provide 3 different constructors.
//    Create 3 objects using the different constructors and print out the variable values.

    constructor()
    {
         legs = 4
         height = 120
    }

    constructor(newlegs:Int){
        legs = newlegs
        height = 130
    }
    constructor(newlegs: Int,newheight: Int){
        legs = newlegs
        height = newheight
    }

    var legs = 3
    var height = 150

    fun printInfo(){
println("Table legs have $legs and height is $height")
    }
}