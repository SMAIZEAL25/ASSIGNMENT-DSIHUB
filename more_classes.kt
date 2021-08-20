fun main(){
    var myAidBox : FirstAidBox = FirstAidBox()
    // here the cleanWound method inside the FirstAidBox class
    // access through the myAidBox object
    myAidBox.cleanWound()
    // here the stitchWound method inside the FirstAidBox class
    // access through the myAidBox object
    myAidBox.stitchWound()
}

class FirstAidBox{
    var noOfPlasters : Int = 5
    // methods
    // the following member functions/methods were defined
    // they can be accessed from outside this class through
    // an object of this class
    fun stitchWound(){
        println("Stitch Wound")
    }
    fun cleanWound(){
        println("Clean Wound")
    }

}