package com.jhonny.DevJhonny

import androidx.compose.foundation.shape.ZeroCornerSize

fun main () {
    getMonth(2) //llamado a la función de meses
    getTrimester(2) //llamado a la función de Trimestres
    getSemester(7)  //Llamamos la función semestres
    result("22")
}

fun result(value: Any){
    when(value){
        is Int -> value+value
        is String -> println(value)
        is Boolean -> if (value) println("Es verdadero") else print("Es falso")
    }
}

fun getSemester(moth: Int):String = when(moth){ //Este when maneja rangos
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12-> "Semestre no válido" //Otra forma de hacer validaciones en caso de no cumplirse ...
        else -> "Semestre no válido"
    }

fun getTrimester(moth: Int){ //Función trimestres, recibe en número un mes para identificar el trimestre del año
    when (moth){ //Cuando reciba el numero identifica el trimestre...
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Trimestre no válido")
    }
}

fun getMonth(moth: Int){ //Función meses, recibe un numero para identificar el nombre del mes
    when(moth){ //Cuando recibe el número identifica el mes...
        1 -> println("Enero ($moth)")
        2 -> { //si queremos tener mas sentencia de codigo, usamos {}
            println("Febrero ($moth)")
            println("Febrero ($moth)")
        }
        3 -> println("Marzo ($moth)")
        4 -> println("Abril ($moth)")
        5 -> println("Mayo ($moth)")
        6 -> println("Junio ($moth)")
        7 -> println("Julio ($moth)")
        8 -> println("Agosto ($moth)")
        9 -> println("SEptiembre ($moth)")
        10 -> println("Octubre ($moth)")
        11 -> println("Noviembre ($moth)")
        12 -> println("Diciembre ($moth)")

        else -> println("Este mes no existe o no es valido ($moth)")
    }
}