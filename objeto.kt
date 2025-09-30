package com.example.jrkotlin

// Declaración de un objeto singleton
object mensaje {
    val nombre = "Mi Instancia Única"
    fun saludar() {
        println("¡Hola desde $nombre!")
    }
}

fun main() {
    // Acceso directo al objeto
    println(mensaje.nombre) // Imprime: Mi Instancia Única
    mensaje.saludar()      // Imprime: ¡Hola desde Mi Instancia Única!
}

