class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valorDeposito: Double) {
        if (valorDeposito > 0)
            saldo += valorDeposito
    }

    fun sacar(valorSaque: Double) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }
}