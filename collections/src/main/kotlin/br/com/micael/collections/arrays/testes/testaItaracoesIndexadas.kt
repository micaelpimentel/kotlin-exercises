package br.com.micael.collections.arrays.testes

fun testaIteracoesIndexadas() {
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    println(salarios.contentToString())

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}