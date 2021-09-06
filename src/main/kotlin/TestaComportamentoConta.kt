fun testaComportamentoConta() {
    val conta1 = Conta(titular = "Fulano", numero = 1000)
    val conta2 = Conta(numero = 1001, titular = "Beltrano")
    conta1.depositar(1000.0)
    conta2.depositar(2000.0)
    println(conta1.titular)
    println(conta1.numero)
    println(conta1.saldo)
    println(conta2.titular)
    println(conta2.numero)
    println(conta2.saldo)

    println("Depositando na conta1")
    conta1.depositar(50.0)
    println(conta1.saldo)
    println("Depositando na conta2")
    conta2.depositar(150.0)
    println(conta2.saldo)

    println("Saque na conta1")
    conta1.sacar(150.0)
    println(conta1.saldo)

    println("Transfere da conta1 para conta2")
    if (conta1.transfere(valor = 33.0, contaDestino = conta2))
        println("Transferido com sucesso")
    else
        println("Saldo insuficiente")
    println(conta1.saldo)
    println(conta2.saldo)
}