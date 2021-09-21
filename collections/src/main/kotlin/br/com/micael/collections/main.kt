package br.com.micael.collections

import br.com.micael.collections.listas.testaCopia

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos.distinct())
}