package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {

    companion object {
        var totalContas = 0
    }

    var saldo = 0.0
        protected set

    init {
        totalContas++
    }

    fun depositar(valorDeposito: Double) {
        if (valorDeposito > 0)
            saldo += valorDeposito
    }

    abstract fun sacar(valorSaque: Double)
}