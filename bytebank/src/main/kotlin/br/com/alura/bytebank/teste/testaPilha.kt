package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

private fun testaPilhaExecucao() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println("Pegou ClassCastException")
        println(e.message)
        e.printStackTrace()
        println(e.cause)
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}