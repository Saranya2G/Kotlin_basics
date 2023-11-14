
fun main(args:Array<String>){

    var onlineStore = OnlineStore()
    var onlineStore1 = OnlineStore("Generic user")
    var onlineStore2 = OnlineStore("Alice")
    var onlineStore3 = OnlineStore("Bob",2002)


}

class OnlineStore {

//    Create an online store user account class that has a userName and balance
//    Create 3 constructors for this class.
//    Inside the constructors, based on the user balance, print out whether they can afford the product tshirt, which costs 20, and if so, how many can they afford.

    constructor(){
        userName = "sam"
        balance = 1200
        canAfford()
    }
    constructor(newUserName: String){
        userName = newUserName
        balance = 2000
        canAfford()
    }
    constructor(newUserName: String,newBalance: Int){
        userName = newUserName
        balance = newBalance
        canAfford()
    }

    var userName = ""
    var balance = 0
    var tshirtPrice = 20

    fun canAfford(){
        if(balance > tshirtPrice){
            println("$userName can afford ${balance/tshirtPrice} tshirts")
        }else{
            println("$userName cannot afford tshirts")
        }

    }
}