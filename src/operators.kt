fun main() {
    //arithmetic operators
    var num1 = 10
    var num2 = 5
    var num3 = 45



    println(num1 * num2)
    println(num1 - num2)
    println(num1 + num2)
    println(num1 / num2)
    println(num1*num3)
    println(num1 % num2) //modulus


    //comparison operators

    var x = 80
    var y = 34

    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)
    println(x == y)//equal to
    println(x != y)//not equal to

    //assignment operators

    var number = 100
    println(number)
    number+= 10
    println(number)
    var number2 = 300
    number2+= 150
    println(number2)

    //logical operators - &&(and) , || (or) ,! (not)

    println(100 == 50 && 100 > 50)
    println(100 == 50 || 100 > 50)
    println(!(100 == 50 || 100 > 50))


}