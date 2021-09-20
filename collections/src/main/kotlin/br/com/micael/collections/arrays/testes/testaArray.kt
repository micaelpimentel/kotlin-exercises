package br.com.micael.collections.arrays.testes

fun testaIdades() {
    val idadesArray = listOf(34, 12, 27, 6, 18)

    var maiorIdade = 0
    idadesArray.forEach {
        if (it > maiorIdade)
            maiorIdade = it
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idadesArray.forEach {
        if (it < menorIdade)
            menorIdade = it
    }
    println(menorIdade)
}