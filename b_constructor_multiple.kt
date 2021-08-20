fun main(){
    var car : AProduct = AProduct("Toyota", 422.2, 1, 12233.2)
    println(car.productName)

    var ebook : AProduct = AProduct("LOTR", 2, 23.3)
}

class AProduct{
    var productName : String = ""
    var productWeight : Double = 0.0
    var productId : Int = 0
    var productPrice : Double = 0.0

    constructor(productName : String,
                productWeight : Double,
                productId : Int,
                productPrice : Double){
        this.productName = productName
        this.productWeight = productWeight
        this.productId = productId
        this.productPrice = productPrice
    }

    constructor(productName: String, productId: Int, productPrice: Double){
        this.productName = productName
        this.productId = productId
        this.productPrice = productPrice
    }

}