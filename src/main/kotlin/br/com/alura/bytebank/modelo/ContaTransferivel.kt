package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        } else
            throw SaldoInsuficienteException()
    }
}