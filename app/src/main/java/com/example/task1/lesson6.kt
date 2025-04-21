package com.example.task1

fun main(){
    var num1: Double = 10.6
    var num2 : Double = 5.0
    var result :Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")

    result = num1 - num2
    println("num1 - num2 is $result")

    result = num1 * num2
    println("num1 * num2 is $result")

    result = num1 / num2
    println("num1 / num2 is $result")

    result = num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operator

    var x:Int = 20
    var y:Int = 10
    var z:Int = 0

    z = x+y
    println("z = x + y = $z")

    z += x
    println("z += x $z")

    z -= x
    println("z -= x $z")

    z *= x
    println("z *= x $z")

    z %= x
    println("z %= x $z")

    //Unary Operator

    var number :Double = 7.6
    var isCheck :Boolean = true;
    println("+number = ${+number}");
    println("-number = ${+number}");
    println("++number = ${+number}");
    println("--number = ${+number}");
    println("+!ischeck = ${!isCheck}");

    var isresult:Double = 4.7
    println("result :$result")

    println("result++ : " + isresult++)

    //Equality and Relational Operators

    var a:Int = 5
    var b:Int = 5

    println("a == b :" + (a == b))
    println("a != b :" + (a != b))
    println("a < b :" + (a < b))
    println("a > b :" + (a > b))
    println("a >= b :" + (a >= b))
    println("a <+ b :" + (a <+ b))

    //Conditional Operators

    var number1 : Int = 5
    var number2 : Int = 8
    var number3 : Int = 12
    var result1 : Boolean = false;

    result1 = (number1 > number2) && (number3 > number2)
    println(result1)

    result1 =(number1 > number2) || (number3 > number2)
    println(result1)

    //Operator Precedence

    //BODMAS

    var result01 : Int = 5+2*4
    println("Result +" +result01)
    result01 = (5+2) *4
    println("Result =" +result01)
    var c : Int = 8
    var v : Int = 4
    var n : Int = 2
    var sum :Int = 0;
    sum = x + --y + --z
    println("x + --y + --z ::: $sum")

    //rangeTo()Function and "in" operator
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'

    var check = 'Z' in testCharRange
    println("mycharRange has z : $check")
    println(myCharRange)
    println(testCharRange)

    //console Input in Android App Development

    println("Enter name :: ")
    var name:String? = readln();

    println("Enter age :: ")
    var age:Int = readln()!!.toInt();
}
