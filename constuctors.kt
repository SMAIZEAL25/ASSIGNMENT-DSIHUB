fun main(){
    // an object of type Product was declared and instantiated below
    var xbox : Product = Product("Xbox Series X", 1, 400.4, 4.0)

    println(xbox.productName) // the productName property of the xbox object was outputted
    // an object of type Product was declared and instantiated, but this object was instantiated
    // using the second constructor in the Product class
    // because of the number of parameters being passed to the constructor argument
    var norton : Product = Product("Norton antivirus", 2, 32.5)
}

// A class called product was defined here
class Product{
    // for class properties/member variables/instance variables were declared
    // and given initial values
    var productName : String = ""
    var productId : Int = 0
    var productPrice : Double = 0.0
    var productWeight : Double = 0.0

    // a constructor was defined here
    constructor(proName : String, proId : Int, proPrice : Double, proWeight : Double){
        this.productName = proName
        this.productId = proId
        this.productPrice = proPrice
        this.productWeight = proWeight
    }

    // another constructor was defined here with fewer parameters
    constructor(proName : String, proId : Int, proPrice : Double){
        this.productName = proName
        this.productId = proId
        this.productPrice = proPrice
    }
}