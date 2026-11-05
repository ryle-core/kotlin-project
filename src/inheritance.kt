//parent class /super class / base class

open class animal{

    var ismammal =true
    var color ="white"

    fun eat(){
        println("animal is eating")

    }
}

//child class/ Sub class/derived class
open class cow : animal(){
    fun sound(){
        println("mooow! moow!")
    }
}
class sheep :cow(){

    fun bleet(){
        println("meee! meee!")
    }
}

fun main() {

    var cow = cow()
    cow.sound()

    var sheep = sheep()




}