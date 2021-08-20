fun main(){
    var myCar : Vehicle = Vehicle("Porsche", "red")
    println(myCar.model)
    println(myCar.color)

    println(Vehicle("Toyota", "black").model)
}

class Vehicle{
    var model : String = ""
    var color : String = ""

    constructor(model : String, color : String){
        this.model = model
        this.color = color
        println("The constructor fired")
    }
}