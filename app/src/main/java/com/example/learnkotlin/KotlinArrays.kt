package com.example.learnkotlin

fun main() {
    /* Kotlin Arrays*/
    /* Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
    To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:*/
    //Example
    //val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    /* Access the Elements of an Array*/
    /* You can access an array element by referring to the index number, inside square brackets.
    In this example, we access the value of the first element in cars:*/
//    println(cars[0])
//    println(cars[1])
    /* Note: Just like with Strings, Array indexes start with 0: [0] is the first element. [1] is the second element, etc.*/
    /* Change an Array Element
    To change the value of a specific element, refer to the index number:*/
//    Example
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    cars[0] = "Opel"
//    println(cars[0])
    /* Array Length / Size*/
    /* To find out how many elements an array have, use the size property:*/
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    println(cars.size)
    /* Check if an Element Exists
    You can use the in operator to check if an element exists in an array:*/
    /* Example*/
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    if ("Volvo" in cars) {
//        println("It exists!")
//    } else {
//        println("It does not exist.")
//    }
    /* Loop Through an Array
    Often when you work with arrays, you need to loop through all of the elements.
    You can loop through the array elements with the for loop, which you will learn even more about in the next chapter.
    The following example outputs all elements in the cars array:*/
//    Example
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    for (x in cars) {
//        println(x)
//    }

}