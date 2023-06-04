package com.jhonny.DevJhonny

fun main () {
    // print(variablesAlfanumericas()

    showMyName()

    showMyAge(21)

    add(20, 40)

    val subtractNumber = subtract(15,5)
    println("La resta es $subtractNumber")
}

fun variablesNumericas(){
    /*
    * Variables numericas
    * */

    //Int -- usa menos espacio en memoria
    val edad:Int = 21
    var edad2 = 25

    // edad2 = 30
    println(edad2)

//long -- usa más espacio de memoria
    val edades:Long = 30000000

    //Float -- es decimal
    val floatExample:Float = 30.1f

    //Double
    val doubleExample:Double = 2.1555555

}

fun variablesAlfanumericas(){

    /*
    * Variables Alfanuméricos
    * */

    //Char
    val charExample1:Char = 'a'
    val charExample2:Char = '8'
    val charExample3:Char = '@'

    //String
    val stringExample:String = "Este es un string"

}

fun variablesBooleanas(){
    /*
    * Variables Booleanas
    * */

    val booleaExample:Boolean = true
    val booleaExample2:Boolean = false
}

/*
*   Esta es una función vacia, no recibe parametros
* */
fun showMyName(){
    println("Me llamo jhonny")
}

/*
*   Esta es una función que recibe un parametro
* */
fun showMyAge(currentAge:Int = 0){
    println("Tengo $currentAge años")
}

/*
*   Esta es una función que recibe un valor (Función de entrada)
* */
fun add(numberOne:Int, numberTow:Int ){
    println(numberOne+numberTow)
}

/*
*   Esta es una función que retorna un valor (Función de salida)
* */
fun subtract(firstNumber:Int, secondsNumber:Int):Int{
    return firstNumber - secondsNumber
}