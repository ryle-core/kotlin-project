
//class is a blueprint of an object
// object is an instance of a class
class Dog(var color: String, var age: Int, var breed: String) {




    fun bark(){
        println("woof! woof!")
    }
    fun wail(){
        println("the dog is wailing its tail")
    }


}

class Cat(var color: String, var age: Int, var breed: String){

    fun meow(){
        println("meow!")
    }
}


fun main() {
    var mydog = Dog("brown", 3, "husky")

    println(mydog.color)
    println(mydog.age)
    var dog2 = Dog("black", 4,"rottweiler")
    var cat = Cat("black", 5,"Orangecat")
    println(cat.color)




}