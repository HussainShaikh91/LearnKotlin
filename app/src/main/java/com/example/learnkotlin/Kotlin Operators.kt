package com.example.learnkotlin

fun main() {
    //Kotlin Operators
   // var x = 100 + 50
   // println(x)
    var sum1 = 100 + 50       // 150 (100 + 50)
    var sum2 = sum1 + 250     // 400 (150 + 250)
    var sum3 = sum2 + sum2    // 800 (400 + 400)
   // println(sum3)

    /*Kotlin divides the operators into the following groups:
            Arithmetic operators
            Assignment operators
            Comparison operators
            Logical operators*/
   /* Arithmetic Operators
            Arithmetic operators are used to perform common mathematical operations.*/
    /*+	Addition	Adds together two values*/

//    var x = 5
//    var y = 3
//    println(x + y)

    /* -	Subtraction	Subtracts one value from another*/
//    var x = 5
//    var y = 3
//    println(x - y)

    /*  *	Multiplication	Multiplies two values*/
//    var x = 5
//    var y = 3
//    println(x * y)

    /*  /	Division	Divides one value from another*/
//    var x  = 12
//    var y = 3
//    println(x / y)

    /*  %	Modulus	Returns the division remainder	x % y*/
//    var x  = 5
//    var y = 2
//    println(x % y)

    /*  ++ Increment	Increases the value by 1*/
//    var x  = 10
//    ++x
//    println(x)

    /* --	Decrement	Decreases the value by 1*/
//    var x = 10
//    --x
//    println(x)

   /* Kotlin Assignment Operators
    Assignment operators are used to assign values to variables.
    In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:*/
//    var x = 10
//    println(x)

    /*The addition assignment operator (+=) adds a value to a variable:*/
//    var x = 10
//    x += 5
//    println(x)

    /*A list of all assignment operators:*/
    /* =	x = 5*/
//    var x = 5
//    println(x)
    /* +=	x += 3*/
//    var x = 5
//    x += 3
//    println(x)
    /* -=	x -= 3*/
//    var x = 5
//    x -= 3
//    println(x)
    /* *=	x *= 3*/
//    var x = 5
//    x *= 3
//    println(x)
    /* /=	x /= 3*/
//    var x = 6
//    x /= 3
//    println(x)
    /* %=	x %= 3*/
//    var x = 5
//    x %= 3
//    println(x)
    /* Kotlin Comparison Operators
    Comparison operators are used to compare two values, and returns a Boolean value: either true or false.*/

    /* ==	Equal to	x == y*/
//    var x = 5
//    var y = 3
//    println(x == y) // returns false because 5 is not equal to 3
    /* !=	Not equal	x != y*/
//    var x = 5
//    var y = 3
//    println(x != y) // returns true because 5 is not equal to 3
    /* >	Greater than	x > y*/
//    var x = 5
//    var y = 3
//    println(x > y) // returns true because 5 is greater than 3
    /* <	Less than	x < y*/
//    var x = 5
//    var y = 3
//    println(x < y) // returns false because 5 is not less than 3
    /* >=	Greater than or equal to	x >= y*/
//    var x = 5
//    var y = 3
//    println(x >= y) // returns true because five is either greater than, or equal, to 3
    /* <=	Less than or equal to	x <= y*/
//    var x = 5
//    var y = 3
//    println(x <= y) // returns false because 5 is neither less than or equal to 3

    /* Kotlin Logical Operators
     Logical operators are used to determine the logic between variables or values:
     */

    /*  && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10*/
//    var x = 5
//    println(x > 3 && x < 10) // returns true because 5 is greater than 3 AND 5 is less than 10
    /* || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4*/
//    var x = 5
//    println(x > 3 || x < 4) // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
    /* !	Logical not	Reverse the result, returns false if the result is true	*/
//    var myBool = true
//    println(!myBool) // returns false because the ! (not) operator reverses the result
}