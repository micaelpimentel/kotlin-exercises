class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valorSaque: Double) {
        if (valorSaque <= this.saldo) this.saldo -= valorSaque
    }
}