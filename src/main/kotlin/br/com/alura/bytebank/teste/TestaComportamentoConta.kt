import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentoConta() {
    val fulano = Cliente(
        nome = "Fulano",
        cpf = "444.444.444-44",
        senha = 1
    )
    val beltrano = Cliente("Beltrano", "444.444.444-44", 1)
    val conta1 = ContaCorrente(titular = fulano, numero = 1000)
    val conta2 = ContaPoupanca(numero = 1001, titular = beltrano)
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
    try {
        conta1.transfere(valor = 800.0, contaDestino = conta2)
        println("Transferido com sucesso")
    }catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    }

    println(conta1.saldo)
    println(conta2.saldo)
}