package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {

    companion object {
        var total = 0
            private set
    }

    var saldo = 0.0
        protected set

    init {
        println("Criando conta")
        total++
    }

    fun depositar(valorDeposito: Double) {
        if (valorDeposito > 0)
            saldo += valorDeposito
    }

    abstract fun sacar(valorSaque: Double)
}