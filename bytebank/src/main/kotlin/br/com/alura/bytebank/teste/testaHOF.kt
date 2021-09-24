package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5) {
        println(it)
    }
    somaReceiver(4,7) {
        println(this)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autenticacao(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234) {
        println("realizar pagamento")
    }
    sistema.entraReceiver(autenticavel, 1234) {
        pagamento()
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma acontecendo")
    resultado(a + b)
    println("soma aconteceu")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("soma acontecendo")
    val total = a + b
    total.resultado()
    println("soma aconteceu")
}