package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun depositar(valorDeposito: Double) {
        if (valorDeposito > 0)
            saldo += valorDeposito
    }

    abstract fun sacar(valorSaque: Double)
}