class ContaSalario(
    titular: String,
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