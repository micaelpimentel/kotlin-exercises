package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjects() {
    val cliente = object : Autenticavel {
        val nome = "Fram"
        val cpf = "111.111.111-11"
        val senha = 1000

        override fun autenticacao(senha: Int) = senha == this.senha
    }

    println("Fliente: ${cliente.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(cliente, 100)

    println("Total de contas: ${Conta.total}")
}