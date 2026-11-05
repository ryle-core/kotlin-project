//same method diff implementation
open class shape{

    open fun draw(){
        println("drawing a shape")

    }

}

class Rectangle :shape(){
    override fun draw(){
        println("drawing a rectangle")
    }
}

class Circle :shape(){
    override fun draw(){
        println("drawing a circle")
    }
}

fun main() {
    var rect  = Rectangle()
    rect.draw()
    var circ = Circle()
    circ.draw()
}