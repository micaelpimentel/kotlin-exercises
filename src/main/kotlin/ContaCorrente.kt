class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valorSaque: Double) {
        val valorComTaxa = valorSaque + 0.1
        super.sacar(valorComTaxa)
    }
}