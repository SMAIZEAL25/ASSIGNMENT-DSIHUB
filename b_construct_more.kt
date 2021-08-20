fun main(){
    var aLaptop : Laptop = Laptop("HP", 4322.1)
    println(aLaptop.model)
    println(aLaptop.price)
}

class Laptop(var model : String, var price : Double){
    init{
        println("The constructor fired")
    }
}