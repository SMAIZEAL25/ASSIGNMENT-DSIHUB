class Person{
    // access modifiers
    // public, private, protected
    public var name : String = ""
    public var age : Int = 0

    fun signIn(){
        println("$name, $age has signed in")
    }
}




fun main(){
    var name : String = "John"
    name = "James"
    name = "Jane"
    println(name)

    val anotherName : String = "Frank"
    //anotherName = "Paul" // this will give an error

    var aPerson : Person = Person()
    aPerson.name = "James"
    aPerson.age = 43
    println(aPerson.name)
    println(aPerson.age)

    aPerson.signIn()
}

