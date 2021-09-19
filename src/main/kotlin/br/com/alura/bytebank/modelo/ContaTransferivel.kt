package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, contaDestino: Conta, senha: Int) {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
        } else
            throw SaldoInsuficienteException(mensagem = """Saldo insuficiente.
                Saldo atual: $saldo
                Valor da transferencia: $valor""")

        if (!autenticacao(senha)) {
            throw FalhaAutenticacaoException()
        }

    }
}