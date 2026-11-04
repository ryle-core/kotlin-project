fun main() {

    //standard library functions - already exists
    var number = Math.sqrt(144.0)
    println(number)

    day()
    student("jack",23,"cybersecurity")
    student("stella",24,"Ai")
}


    //user-defined functions -created and defined by programmers
    fun day(){

        println("today is Wednesday")

    }

fun student(name : String , age: Int, course : String){

    println("$name is $age. is studying $course")
}

