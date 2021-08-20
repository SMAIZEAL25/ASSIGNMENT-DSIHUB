fun main() {
    var myCar : Car = Car("Chevy Impala", 1970, "black")

//    var sentence : String
//    sentence = "My car is a ${myCar.yearOfMan} ${myCar.model}, and it is ${myCar.color}"
//    println(sentence)
//
//    println(myCar)
}


class Car(var model : String, var yearOfMan : Int, var color : String){
    init{
        println(model)
    }
}




