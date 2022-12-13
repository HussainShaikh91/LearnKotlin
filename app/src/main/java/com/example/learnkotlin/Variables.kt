package com.example.learnkotlin

fun main() {
    //Variables
   /* Kotlin Variables
            Variables are containers for storing data values.
    To create a variable, use var or val, and assign a value to it with the equal sign (=):
*/
    /*Syntax
    var variableName = value
    val variableName = value*/

    /*Example*/
    var name = "John"
    val birthyear = 1975

    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear

    /*The difference between var and val is that variables declared with the
    var keyword can be changed/modified, while val variables cannot.*/
    /*You can also use the + character to add a variable to another variable:

    Example*/
    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
   // println(fullName)

    val x = 5
    val y = 6
    //println(x + y) // Print the value of x + y
}

