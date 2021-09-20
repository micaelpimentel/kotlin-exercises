package br.com.micael.collections.arrays.testes

fun testaAggragatedFunctions() {
    val idadesArray: IntArray = intArrayOf(34, 12, 27, 6, 18, 61, 59)

    val maiorIdade = idadesArray.maxOrNull()
    println(maiorIdade)

    val menorIdade = idadesArray.minOrNull()
    println(menorIdade)

    val media = idadesArray.average()
    println(media)

    idadesArray.run {
        println(media)

        all { it > 18 }.also(::println)
        any { it > 18 }.also(::println)
        filter { it > 18 }.also(::println)
        find { it == 18 }.also(::println)
    }
}