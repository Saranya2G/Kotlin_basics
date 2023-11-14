fun main(args: Array<String>){

    var bankAccount = BankAccount()
    bankAccount.amount = 130
    bankAccount.amount = 200


}

class BankAccount {

    //A bank account class has a variable amount, and credit rating.
    // Whenever a user adds money to the account, their credit rating rises.
    // Whenever a user takes money from the account, their rating falls.Implement this in a program.

    var creditRating = 50
    var amount: Int = 0
        get() = field
        set(value){
            if(value > amount){
                creditRating++
            }else{
                creditRating--
            }
            field = value
            println("New credit rating $creditRating")
        }



}