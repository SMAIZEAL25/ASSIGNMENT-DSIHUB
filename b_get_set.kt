fun main(){
    var myAccount : ABankAccount = ABankAccount()
    myAccount.setAccountBalance(12345.3)
    var balance : Double = myAccount.getAccountBalance()
    println(balance)

    var mClass : MyClass = MyClass("John")

}

class ABankAccount{
    // getters and setters
    // accessors and mutators
    private var accountBalance : Double = 0.0
    private var bvn : Int = 0

    // getters
    fun getAccountBalance() : Double{
        return this.accountBalance
    }

    fun setAccountBalance(accountBalance : Double){
        this.accountBalance = accountBalance
    }
}

class MyClass{
    private var name : String = ""
    constructor(name : String){
        this.name = name
    }
}