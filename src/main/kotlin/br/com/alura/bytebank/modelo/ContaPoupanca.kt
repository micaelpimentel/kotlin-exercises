package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular,
    numero
) {
    override fun sacar(valorSaque: Double) {
        if (valorSaque <= this.saldo) this.saldo -= valorSaque
    }
}