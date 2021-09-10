fun main() {
    println("Bem vindo ao Bytebank")
    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fram", 1001)

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)
    println("Saldo apos deposito")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo apos saque")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo apos transferencia")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
}