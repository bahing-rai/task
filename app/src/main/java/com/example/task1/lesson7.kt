package com.example.task1

fun main(){
    println("Please enter a number :")

    var number:Any = readln()!!.toInt()

    if(number.toString().toInt() % 2 ==0){
        println("$number is even")
    }else{
        println("$number is odd")
    }

    //if else -ilabber statment

    println("Please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()
    if(yourAge < 13) {
        println("You are a chile")
    }else if (yourAge < 19){
        println("your are a teenager")
    }else{
        if(yourAge < 50){
            println("You are an adult")
        }else{
            println("You are a senior")
        }
    }

    //Nested if statement

    println("Please enter 3 number :")
    var number1 : Int = readln()!!.toInt()
    var number2 : Int = readln()!!.toInt()
    var number3 : Int = readln()!!.toInt()
    var largestNumber: Int
    if(number1 >= number2){
        if(number1 >= number3){
            largestNumber = number1
        }else{
            largestNumber = number3
        }
    }else{
        if(number2 >= number3){
            largestNumber = number3
        }else{
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")


    //When statement

    println("Please enter a day number of week : ")
    var dayNumber :Int = readln()!!.toInt()
    var day:String
    when(dayNumber)
    {
        1 -> day = "Sundey"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thurday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid dat choice"
    }
    println(day)


    //For loop

    for (i in 1..9){
        println(i)
    }

    var sum:Int = 0
    for(x in 0 .. 5){
        println(x)
        sum += x // sum = sum + x
    }

    var sum1:Int = 0
    for (x in 0..10){
        println(x)
        sum += x
    }
}