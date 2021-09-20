package br.com.micael.collections.arrays.testes

fun testaRanges() {
    val serie = 1.rangeTo(10)
    for (s in serie)
        println(s)

    (0 until 50 step 2).forEach(::println)
    (100 downTo 50 step 2).forEach(::println)

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo)
        println("dentro do intervalo")
    else
        println("fora do intervalo")
    val letras = 'a'..'j'
    val letra = 'k'
    println(letra in letras)
}