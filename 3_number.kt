package com.example.jrkotlin
/*
Jhoan Romero
Urenex Group LLC
Systems Engineer
3numbers
 */
fun main(){

    println("Digite el valor del numero 1:")
    val numeroUno= readln().toInt()
    println("Digite el valor del numero 2:")
    val numeroDos= readln().toInt()
    println("Digite el valor del numero 3:")
    val numeroTres= readln().toInt()

        if(numeroUno>numeroDos && numeroUno>numeroTres){
            println("El numero 1 es mayor:")
        }else if (numeroDos>numeroUno && numeroDos>numeroTres) {
            println("El numero 2 es mayor:")
        }else{
            println("El numero 3 es mayor:")
        }

}
