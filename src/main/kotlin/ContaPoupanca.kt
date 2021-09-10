class ContaPoupanca(
    titular: String,
    numero: Int
) : ContaTransferivel(
    titular,
    numero
) {
    override fun sacar(valorSaque: Double) {
        if (valorSaque <= this.saldo) this.saldo -= valorSaque
    }
}