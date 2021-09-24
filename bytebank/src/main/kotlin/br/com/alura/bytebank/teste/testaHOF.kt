package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5) {
        println(it)
    }
    somaReceiver(4,7) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autenticacao(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 12534) {
        println("realizar pagamento")
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma acontecendo")
    resultado(a + b)
    println("soma aconteceu")
}

fun somaReceiver(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma acontecendo")
    resultado(a + b)
    println("soma aconteceu")
}