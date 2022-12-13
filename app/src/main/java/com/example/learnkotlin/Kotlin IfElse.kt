package com.example.learnkotlin

fun main() {
    /* Kotlin Conditions and If..Else*/
//    if (20 > 18) {
//        println("20 is greater than 18")
//    }
//    val x = 20
//    val y = 18
//    if (x > y) {
//        println("x is greater than y")
//    }
    /* Kotlin else
    Use else to specify a block of code to be executed if the condition is false.*/
    /*Syntax*/
//    if (condition) {
//        // block of code to be executed if the condition is true
//    } else {
//        // block of code to be executed if the condition is false
//    }
//    val time = 20
//    if (time < 18) {
//        println("Good day.")
//    } else {
//        println("Good evening.")
//    }
    /* Kotlin else if
    Use else if to specify a new condition if the first condition is false.*/
//    Syntax
//    if (condition1) {
//        // block of code to be executed if condition1 is true
//    } else if (condition2) {
//        // block of code to be executed if the condition1 is false and condition2 is true
//    } else {
//        // block of code to be executed if the condition1 is false and condition2 is false
//    }
//    val time = 22
//    if (time < 10) {
//        println("Good morning.")
//    } else if (time < 20) {
//        println("Good day.")
//    } else {
//        println("Good evening.")
//    }
    /* Kotlin If..Else Expressions
    In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):*/
//    val time = 20
//    val greeting = if (time < 18) {
//        "Good day."
//    } else {
//        "Good evening."
//    }
//    println(greeting)
    /* When using if as an expression, you must also include else (required).*/

    /* Note: You can ommit the curly braces {} when if has only one statement:*/
    //Example
//    val time = 20
//    val greeting = if (time < 18) "Good day." else "Good evening."
//    println(greeting)


}