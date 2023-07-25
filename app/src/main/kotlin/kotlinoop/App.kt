
package kotlinoop

class Car {
    var model :String = ""
    var serialNumber :Int = 0
    var min :Double = 10000.0
    
    
    fun details (){
        println("$model : $serialNumber")
    }
    
    fun canIBuyIt (price :Double){
        if (price < min){
            println("You cant buy $model becouse is low price is $min")
        }else
            println("You can Buy it now")
    }
}

fun main() {
    val car1 = Car()
    car1.model = "BMW"
    car1.serialNumber = 14461
    println("car1\n model : ${car1.model} \n ${car1.serialNumber} ")
    car1.details()
    car1.canIBuyIt(500.5)

}