package com.jhonny.DevJhonny

fun main (){
    inmutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Name", "Age", "Languaje")

    println(readOnly.size) //size get value
    println(readOnly)
    println(readOnly.first())
    println(readOnly.last())
    println(readOnly[0])

}