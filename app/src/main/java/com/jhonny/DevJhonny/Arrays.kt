package com.jhonny.DevJhonny

fun main() {
    val weekDays = arrayOf("Lunes","Martes","Miercoles","jueves","Viernes","Sabado","Domingo")
    println(weekDays[0])
    println(weekDays.size)

    if (weekDays.size >= 8){
        //println(weekDays.get(1)) Poco usado
        println(weekDays[7])
    }else{
        println("No hay más valores en el array")
    }

    //Modificar valores en el array
    weekDays[0]="Bonito lunes!"
    println(weekDays[0])

    //Bucles en el array
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for ((position,  value ) in weekDays.withIndex()){
        println("La posición $position, contiene $value")
    }

    for (weekDays in weekDays){
    println("now is $weekDays")
    }

}