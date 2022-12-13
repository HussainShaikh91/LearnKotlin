package com.example.learnkotlin

fun main() {
    /* Kotlin Strings
    Strings are used for storing text.*/
    /*Example*/
    var greeting = "Hello"
//    println(greeting)
    var name: String
    name = "John"
//    println(name)
//    var txt = "Hello World"
//    println(txt[0]) // first element (H)
//    println(txt[2]) // third element (l)
   /* [0] is the first element. [1] is the second element, [2] is the third element, etc.*/

    /* String Length*/
    //var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //println("The length of the txt string is: " + txt.length)

    /* String Functions
    There are many string functions available, for example toUpperCase() and toLowerCase():*/
//    var txt = "Hello World"
//    println(txt.toUpperCase())   // Outputs "HELLO WORLD"
//    println(txt.toLowerCase())   // Outputs "hello world"

    /*Comparing Strings
            The compareTo(string) function compares two strings and returns 0 if both are equal:*/
//    var txt1 = "Hello World"
//    var txt2 = "Hello World"
//    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    /* Finding a String in a String
     The indexOf() function returns the index (the position)
     of the first occurrence of a specified text in a string (including whitespace):*/
//    var txt = "Please locate where 'locate' occurs!"
//    println(txt.indexOf("locate"))  // Outputs 7
    /* Remember that Kotlin counts positions from zero.
 0 is the first position in a string, 1 is the second, 2 is the third ...*/

    /* Quotes Inside a String
To use quotes inside a string, use single quotes ('):*/
//    var txt1 = "It's alright"
//    var txt2 = "That's great"
//    println(txt1)
//    println(txt2)
    /* String Concatenation
    The + operator can be used between strings to add them together to make a new string. This is called concatenation:*/
//    var firstName = "John"
//    var lastName = "Doe"
//    println(firstName + " " + lastName)
    /* Note that we have added an empty text (" ") to create a space between firstName and lastName on print.*/
    /* You can also use the plus() function to concatenate two strings:*/
//    Example
//    var firstName = "John "
//    var lastName = "Doe"
//    println(firstName.plus(lastName))
    /* String Templates/Interpolation
    Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.

    Just refer to the variable with the $ symbol:*/
    var firstName = "John"
    var lastName = "Doe"
    println("My name is $firstName $lastName")


}