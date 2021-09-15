package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular,
    numero
) {
    override fun sacar(valorSaque: Double) {
        val valorComTaxa = valorSaque + 0.1
        if (this.saldo >= valorComTaxa) this.saldo -= valorComTaxa
    }
}