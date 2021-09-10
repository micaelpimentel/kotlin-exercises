fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fram", 1001)
    val contaSalario = ContaSalario("Maria", 1002)

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)
    contaSalario.depositar(1000.0)

    println("Saldo apos deposito")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
    contaSalario.saldo.also(::println)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)
    contaSalario.sacar(100.0)

    println("Saldo apos saque")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
    contaSalario.saldo.also(::println)

    contaCorrente.transfere(100.0, contaSalario)

    println("Saldo apos transferencia corrente -> salario")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
    contaSalario.saldo.also(::println)

    contaPoupanca.transfere(100.0, contaSalario)

    println("Saldo apos transferencia poupanca -> salario")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
    contaSalario.saldo.also(::println)

    // contaSalario.transfere(100.0, contaCorrente)
}