package br.com.micael.collections.arrays.testes

fun testaCompondoOperacoes() {
    val salarios = bigDecimalArrayOf("10000.55", "2000.00", "8600.23", "5000.00", "4650.00", "1500.00")

    salarios.sorted().also(::println)
    salarios.sorted().takeLast(3).also(::println)
    salarios
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
        .also(::println)
}