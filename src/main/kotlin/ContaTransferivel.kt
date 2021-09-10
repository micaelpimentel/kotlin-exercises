abstract class ContaTransferivel(
    titular: String,
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
        }
        return false
    }
}