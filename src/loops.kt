fun main() {
    //while loop
    var number = 20 //set first value

    while(number <= 25) { //condition

        println("number is $number")
        number ++ //increment/decrement
    }
//for loop
    for( x in 20 .. 25) {
        println("$x")
    }


    //do while loop ,

    var x = 10

    do {
        println("hey java")
        x++
    } while(x <15)


    //break and continue
    for (c in 50 .. 55){

        if (c == 54)
            break
        println("$c")

    }

    for (d in 40 .. 54){
        if (d == 45)
            continue
        println("$d")
    }
}



