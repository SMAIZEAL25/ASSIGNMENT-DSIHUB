fun main() {
    var goat: Animal1 = Animal1("He-goat")
    goat.eat("yam")
}

class Animal1 {

    var name: String = ""
    var age: Int = 0
    var species: String = ""

    constructor(name : String){
        this.name = name
    }

    constructor(name: String, age: Int, species: String){
        this.name = name
        this.age = age
        this.species = species
    }

    fun eat(nameOfFood: String){
        println("${this.name} is eating $nameOfFood")
    }

    fun walk(){
       println("$name is walking...")
    }

    fun sleep(){
       println("$name is sleeping...")
    }
}