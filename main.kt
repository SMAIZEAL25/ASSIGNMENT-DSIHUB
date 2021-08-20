fun main(){
    var myUser : User = User()
    var aUser : User = User()
    myUser.name = "John"
    myUser.age = 1000

    println(myUser.name)
    println(myUser.age)

    aUser.name = "James"
    aUser.age = 56

    println(aUser.name)
    println(aUser.age)

    println(myUser.name)
    println(myUser.age)
}

class User{
    var name : String = ""
    var age : Int = 0
}

