package kotlinoop


class Humen (){

    constructor(id:Long):this(){
        println(id)
    }
    constructor(id:String):this(){
        println(id)
    }


}



fun main() {
    val h1: Humen = Humen(56457489)
    val h2: Humen = Humen("5cqd6qf45748")

}