package com.example.learnkotlin

fun main() {
    //Kotlin Data Types
//    val myNum = 5             // Int
//    val myDoubleNum = 5.99    // Double
//    val myLetter = 'D'        // Char
//    val myBoolean = true      // Boolean
//    val myText = "Hello"      // String
//
//    println(myNum)
//    println(myDoubleNum)
//    println(myLetter)
//    println(myBoolean)
//    println(myText)

/*that it is possible to specify the type if you want:*/
//    val myNum: Int = 5                // Int
//    val myDoubleNum: Double = 5.99    // Double
//    val myLetter: Char = 'D'          // Char
//    val myBoolean: Boolean = true     // Boolean
//    val myText: String = "Hello"      // String
//
//    println(myNum)
//    println(myDoubleNum)
//    println(myLetter)
//    println(myBoolean)
//    println(myText)

   /* Data types are divided into different groups:
    Numbers
    Characters
    Booleans
    Strings
    Arrays*/
   /* Integer Types
            Byte
    The Byte data type can store whole numbers from -128 to 127.
    This can be used instead of Int or other integer types to save memory
    when you are certain that the value will be within -128 and 127:*/
//    val myNum: Byte = 100
//    println(myNum)

   /* Short
    The Short data type can store whole numbers from -32768 to 32767:*/
//    val myNum: Short = 5000
//    println(myNum)

   /* Int
    The Int data type can store whole numbers from -2147483648 to 2147483647:*/
//    val myNum: Int = 100000
//    println(myNum)

   /* Long
    The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807.
    This is used when Int is not large enough to store the value. Optionally,
    you can end the value with an "L":*/
//    val myNum: Long = 15000000000L
//    println(myNum)

    /*Difference Between Int and Long
    A whole number is an Int as long as it is up to 2147483647.
    If it goes beyond that, it is defined as Long:*/
//    val myNum1 = 2147483647  // Int
//    val myNum2 = 2147483648  // Long

/*
    Floating Point Types
    Floating point types represent numbers with a decimal, such as 9.99 or 3.14515.

    The Float and Double data types can store fractional numbers:
*/
    /*Float Example*/
//    val myNum: Float = 5.75F
//    println(myNum)

    /*Double Example*/
    val myNum: Double = 19.99
   // println(myNum)

    /*Use Float or Double?

    The precision of a floating point value indicates how many digits the
    value can have after the decimal point. The precision of Float is only six
    or seven decimal digits, while Double variables have a precision of about
    15 digits. Therefore it is safer to use Double for most calculations.
    Also note that you should end the value of a Float type with an "F".*/

   /* Scientific Numbers
    A floating point number can also be
    a scientific number with an "e" or "E" to indicate the power of 10:*/
    val myNum1: Float = 35E3F
    val myNum2: Double = 12E4  // E4 it men's 4 times 0 zero
//    println(myNum1)
//    println(myNum2)
   /* Booleans
    The Boolean data type and can only take the values true or false:*/
   /* Example*/
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
//    println(isKotlinFun)   // Outputs true
//    println(isFishTasty)   // Outputs false
    /*Boolean values are mostly used for conditional testing*/

    /*Characters
    The Char data type is used to store
            a single character. A char value must be surrounded
            by single quotes, like 'A' or 'c':*/
    val myGrade: Char = 'B'
//    println(myGrade)

  /*  Strings
    The String data type is used to store a sequence
            of characters (text). String values must be surrounded by double quotes:*/
    val myText: String = "Hello World"
//    println(myText)

    /*Arrays
    Arrays are used to store multiple values in a
    single variable, instead of declaring separate variables for each value.*/

   /* Type Conversion
            Type conversion is when you convert the value of one data type to another type.
    In Kotlin, numeric type conversion is different from Java. For example,
    it is not possible to convert an Int type to a Long type with the following code:*/
//    Example
  /*  val x: Int = 5
    val y: Long = x
    println(y) // Error: Type mismatch */

   /* To convert a numeric data type to another type, you must use one of the following functions: toByte(),
    toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():*/
    val x: Int = 5
    val y: Long = x.toLong()
   // println(y)

}