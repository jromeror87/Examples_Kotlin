package com.example.jrkotlin

import kotlin.random.Random
fun main() {

    val numFilas = 3
    val numColumnas = 3
    val maxValor = 10
    val matriz = Array(numFilas) { IntArray(numColumnas) }


    for (i in 0 until numFilas) {
        for (j in 0 until numColumnas) {
            matriz[i][j] = Random.nextInt(maxValor)
        }

        for (fila in matriz) {
            println(fila.joinToString())
        }

        println("")
        println("Hayamos la determinate de la matriz con Regla de Sarrus")
        println("")

        var var00 = matriz[0][0]
        var var01 = matriz[0][1]
        var var02 = matriz[0][2]
        var var10 = matriz[1][0]
        var var11 = matriz[1][1]
        var var12 = matriz[1][2]
        var var20 = matriz[2][0]
        var var21 = matriz[2][1]
        var var22 = matriz[2][2]

        val detA =
            (((var00 * var11 * var22) + (var01 * var12 * var20) + (var02 * var10 * var21)) - ((var02 * var11 * var20 + (var00 * var12 * var21) + (var01 * var10 * var22))))
        println("El determinante de la matrix es: $detA")
    }
}
