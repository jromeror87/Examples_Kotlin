package com.example.jrkotlin
/*
Jhoan Romero
Urenex Group LLC
Systems Engineer
Employers
 */
fun main(){
    for (i in 1..3) {
        val valorHoras: Float = 17.5f
        println("Porfavor Digite el nombre del empleado $i: ")
        val nameEmpleado = readln().toString()
        println("Digite las Horas trabajadas en la semana del empleado $i: ")
        val hourTrabajadas = readln().toFloat()
        if (hourTrabajadas >= 40) { /* Preguntamos si hay horas extras y las calculamos*/
            val valorHorasExtras = valorHoras / 2
            val cantidadHorasExtras = hourTrabajadas - 40
            val valorAdicionalXhe = cantidadHorasExtras * valorHorasExtras
            val totalPagar = (valorHoras * hourTrabajadas) + (valorAdicionalXhe)
            println("El Salario del Empleado es $totalPagar Dolares")
        } else {
            /* Si no hay horas extras asi queda */
            val salarioEmpleado = valorHoras * hourTrabajadas
            println("El Salario del Empleado es $salarioEmpleado Dolares")
        }
    }
}
