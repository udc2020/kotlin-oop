# Kotlin OOP Course 🔥

A brief summary OOP Kotlin Course (From Our Channel )
You Can See The Full Course [here]()

## Class's in Kotlin

```kotlin
    class ClassName {
    
    }
    
    fun main(){
        // Create Object of class
        var c1 = ClassName()
    }
```

### Mambers (variables ,functions)

```kotlin
    class Car {
        // Vars Mambers
        var model :String = ""
        var serialNumber :Int = 0
        var minPrice :Double = 10000.0
    
        // Functions Mambers
        fun details (){
            println("$model : $serialNumber")
        }
    
        fun canIBuyIt (price :Double){
            if (price < minPrice){
                println("You cant buy $model becouse low price is $minPrice")
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
```