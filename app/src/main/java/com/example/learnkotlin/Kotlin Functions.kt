package com.example.learnkotlin

fun main() {
    /* Kotlin Functions*/
    /* A function is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a function.
    Functions are used to perform certain actions, and they are also known as methods.*/

    /* Predefined Functions
    So it turns out you already know what a function is. You have been using it the whole time through this tutorial!
    For example, println() is a function. It is used to output/print text to the screen:*/
    /* Example*/
//    fun main() {
//        println("Hello World")
//    }
    /* Create Your Own Functions
    To create your own function, use the fun keyword, and write the name of the function, followed by parantheses ():*/
//    Example
    /* Create a function named "myFunction" that should output some text:*/
    fun myFunction() {
        println("I just got executed!")
    }
    /* Call a Function
    Now that you have created a function, you can execute it by calling it.
    To call a function in Kotlin, write the name of the function followed by two parantheses ().
    In the following example, myFunction() will print some text (the action), when it is called:*/
    /* Example*/
    //myFunction() // Call myFunction
    /* A function can be called multiple times, if you want:*/
//    Example
//    myFunction()
//    myFunction()
//    myFunction()
    /* Function Parameters
    Information can be passed to functions as parameter.
    Parameters are specified after the function name, inside the
    parentheses. You can add as many parameters as you want, just separate them with a comma.
    Just note that you must specify the type of each parameter (Int, String, etc).
    The following example has a function that takes a String called
    fname as parameter. When the function is called, we pass along a first name, which is used inside the function to print the full name:*/
//    Example
    fun myFunction(fname: String) {
        println(fname + " Doe")
    }
    //Calling function
//    myFunction("John")
//    myFunction("Jane")
//    myFunction("George")
    /* When a parameter is passed to the function, it is called an argument.
     So, from the example above: fname is a parameter, while John, Jane and George are arguments.*/

    /* Multiple Parameters
    You can have as many parameters as you like:*/
//    Example
//    fun myFunction(fname: String, age: Int) {
//        println(fname + " is " + age)
//    }
//    //call function
//    myFunction("John", 35)
//    myFunction("Jane", 32)
//    myFunction("George", 15)

    /* Note: When working with multiple parameters, the function call must have the same number of arguments as there are
     parameters, and the arguments must be passed in the same order.*/

    /* Return Values
    In the examples above, we used functions to output a value. In the following example, we will use a function to return a value and assign it to a variable.
    To return a value, use the return keyword, and specify the return type after the function's parantheses (Int in this example):*/

   /* Example
    A function with one Int parameter, and Int return type:*/

//    fun myFunction(x: Int): Int {
//        return (x + 5)
//    }
//    //Calling function
//    var result = myFunction(3)
//    println(result)

    /*Using two parameters:
    Example*/
   /*  A function with two Int parameters, and Int return type:*/

//    fun myFunction(x: Int, y: Int): Int {
//        return (x + y)
//    }
//    //Calling function
//    var result = myFunction(3, 5)
//    println(result)

    /* Shorter Syntax for Return Values
    There is also a shorter syntax for returning values. You can use the = operator instead of return without
    specifying the return type. Kotlin is smart enough to automatically find out what it is:*/
    //Example
//    fun myFunction(x: Int, y: Int) = x + y
//    //call
//    var result = myFunction(3, 5)
//    println(result)



}
