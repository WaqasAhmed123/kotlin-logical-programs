//class  Car(var brand: String, var model: String, var year: Int){
////    var brand = ""
////    var model = ""
////    var year = 0
//    fun drive(carName:String="None"){
//        println("$carName is driven by me.")
//
//    }
//}
open class Parent{
    val color="White"

}
open class Child:Parent(){
    fun colorOfChild(){
        println("The color of child is $color")
    }

}

class  GrandChild:Child(){

}