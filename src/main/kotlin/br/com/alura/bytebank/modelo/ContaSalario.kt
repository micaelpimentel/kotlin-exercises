package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valorSaque: Double) {
        if (this.saldo >= valorSaque)
            this.saldo -= valorSaque
    }
}