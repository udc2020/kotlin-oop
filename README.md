# Kotlin OOP Course 🔥

A brief summary OOP Kotlin Course (From Our Channel )
You Can See The Full Course [here]()

## Class's in Kotlin

```kotlin
class ClassName {
    // class body
}
```

```kotlin
fun main() {
    // Create Object of class
    val c1 = ClassName()
}
```

### Mambers (variables ,functions)

```kotlin
class Car {
    // Vars Mambers
    var model: String = ""
    var serialNumber: Int = 0
    var minPrice: Double = 10000.0

    // Functions Mambers
    fun details() {
        println("$model : $serialNumber")
    }

    fun canIBuyIt(price: Double) {
        if (price < minPrice) {
            println("You cant buy $model becouse low price is $minPrice")
        } else
            println("You can Buy it now")
    }
}
```

```kotlin
fun main() {
    val car1 = Car() // Object

    // Accessing mamabers (vars)
    car1.model = "BMW"
    car1.serialNumber = 14461
    println("car1\n model : ${car1.model} \n ${car1.serialNumber} ")

    // Accessing mamabers (functions)
    car1.details()
    car1.canIBuyIt(500.5)
}
```

## Constructor

we can use constructor by call it like that

```kotlin
class Humen {
    // conhstructor with params
    constructor(name: String) {
        println("$name he Says hello to you")
    }
}
```

```kotlin
fun main() {
    val h1: Humen = Humen("abdlkrim")
    val h2: Humen = Humen("kamal")

}
```

or By using ***class Function***

```kotlin
class Humen(name: String) {
    init {
        println("$name he Says hello to you")
    }
}
```

```kotlin
fun main() {
    val h1: Humen = Humen("abdlkrim")
    val h2: Humen = Humen("kamal")

}
```

## Access Modifiers (public, private)

```kotlin
class Humen(name: String) {
    val fName: String = name
    private val _passwordWallat: Long = 3481799998

    init {
        println("$name he Says hello to you")
    }

    public fun passwordHasher(): String {
        return _passwordWallat.toString().replace("[0-9]".toRegex(), "*")
    }

    public fun countryCode(country: String): String {
        when (country) {
            "dz" -> return "+213"
            "tn" -> return "+212"
            "mr" -> return "+211"
            else -> return "unknown"
        }
    }
}

```

```kotlin

fun main() {
    val h1: Humen = Humen("abdlkrim")
    val h2: Humen = Humen("kamal")

    println("${h1.fName} Country Code is ${h1.countryCode("ml")}")
    println("${h2.fName} Country Code is ${h2.countryCode("dz")}")

    println("Password : ${h1.passwordHasher()}")


}

```

## Inhertance

simple inheritance

```kotlin

open class Humen(name: String) {
    val fName: String = name

    private val _passwordWallat: Long = 3481799998

    init {
        println("$name he Says hello to you")
    }

    public fun passwordHasher(): String {
        return _passwordWallat.toString().replace("[0-9]".toRegex(), "*")
    }

    public fun countryCode(country: String): String {
        when (country) {
            "dz" -> return "+213"
            "tn" -> return "+212"
            "mr" -> return "+211"
            else -> return "unknown"
        }
    }

}
```

```kotlin
class Employer(name: String) : Humen(name) {
    init {
        println("my name is $name and i 'm employer now")
    }
}
class Student(name: String) : Humen(name) {
    init {
        println("my name is $name and i 'm student now")
    }
}
```

```kotlin

fun main() {
    val emp1 = Employer("karim")
    println("${emp1.fName}  country code is ${emp1.countryCode("dz")}")
    println("##############")
    val student1 = Student("mohammed")
    println("${student1.fName}  country code is ${student1.countryCode("tn")}")

}
```

### overriding


```kotlin


open class Humen(name: String) {

    val fName: String = name

    private val _passwordWallat: Long = 3481799998

    init {
        println("$name he Says hello to you")
    }

    public fun passwordHasher(): String {
        return _passwordWallat.toString().replace("[0-9]".toRegex(), "*")
    }

    public fun countryCode(country: String): String {
        when (country) {
            "dz" -> return "+213"
            "tn" -> return "+212"
            "mr" -> return "+211"
            else -> return "unknown"
        }
    }

    open  fun sleeping (){
        println("Normal humen sleeping 8h ")
    }

}

open class Employer(name: String) : Humen(name) {
    init {
        println("my name is $name and i 'm employer now")
    }
    public fun salary(){
        println("I get Some mony from my job")
    }
}

open class Student(name: String) : Humen(name) {
    init {
        println("my name is $name and i 'm student now")
    }

    // edit the sleeping function from Humen
    override fun sleeping (){
        println("Students sleeping less than 8h")
    }
}
```

## Encapsulation

### setters & gettrs

```kotlin

open class Humen(name: String,_age:Int) {

    val fName: String = name
    var age:Int = _age
    // getters & setters
    get() { return field} // shorthand get() = field
    set(value) {field = value} // shorthand set(value) = filed =


    private var _passwordWallat: Long = 3481799998


    init {
        println("$name he Says hello to you")
    }

    public fun passwordHasher(): String {
        return _passwordWallat.toString().replace("[0-9]".toRegex(), "*")
    }

    public fun countryCode(country: String): String {
        when (country) {
            "dz" -> return "+213"
            "tn" -> return "+212"
            "mr" -> return "+211"
            else -> return "unknown"
        }
    }

    open  fun sleeping (){
        println("Normal humen sleeping 8h ")
    }

}
```

```kotlin
fun main() {
    val h1: Humen = Humen("sami", 30)
    h1.age = 22
    println(h1.age)
    println("##############")


}
```

## Abstraction

### abstract class & method

```kotlin
abstract class Organism{
    abstract fun breathes()
}
```
#### Trees

```kotlin
class Trees:Organism(){
    override fun breathes() {
        println("Trees brathing CO2")
    }
}
```

#### Humen

```kotlin

class Humen(name: String, _age: Int):Organism() {

    val fName: String = name
    var age: Int = _age
    // getters & setters
    get() {
        return field
    } // shorthand get() = field
    set(value) {
        field = value
    } // shorthand set(value) = filed =


    private var _passwordWallat: Long = 3481799998


    init {
        println("$name he Says hello to you")
    }

    public fun passwordHasher(): String {
        return _passwordWallat.toString().replace("[0-9]".toRegex(), "*")
    }

    public fun countryCode(country: String): String {
        when (country) {
            "dz" -> return "+213"
            "tn" -> return "+212"
            "mr" -> return "+211"
            else -> return "unknown"
        }
    }

    open fun sleeping() {
        println("Normal humen sleeping 8h ")
    }

    override fun breathes(){
        println("Humens brathing Oxygen")
    }

}

```
### Interface

```kotlin

interface Organism{
    fun breathes()
}
```

```kotlin
class Trees:Organism{
    override fun breathes() {
        println("Trees brathing CO2")
    }
}
```

## Polymorphism

```kotlin
class Humen (){

    constructor(id:Long):this(){
        println(id)
    }
    constructor(id:String):this(){
        println(id)
    }


}
```


```kotlin
fun main() {
    val h1: Humen = Humen(56457489)
    val h2: Humen = Humen("5cqd6qf45748")

}
```