// getters and setters
// accessors and mutators
fun main(){
    var myAccount : BankAccount = BankAccount(10000000.3, 121322334)
    myAccount.setAccountBalance(432.2)
    println(myAccount.getAccountBalance())
}

class BankAccount{
    // access modifiers
    // public, private, protected
    // the following member variables were declared as private
    // to restrict access to them from outside this class body
    private var accountBalance : Double = 0.0
    private var bvn : Int = 0

    // a constructor was defined which will enable
    // the initialization of the class properties
    // at the time an object of this class is being created
    constructor(accountBalance : Double, bvn : Int){
        this.accountBalance = accountBalance
        this.bvn = bvn
    }

    // Accessors and mutators
    // A getter function was defined here
    // all it does is return the value
    // of the accountBalance property
    fun getAccountBalance() : Double{
        return this.accountBalance
    }

    // a setter function was defined
    // all it does is receive a value which
    // will be assigned to the accountBalance property
    // of this class
    fun setAccountBalance(accountBalance : Double){
        this.accountBalance = accountBalance
    }
}