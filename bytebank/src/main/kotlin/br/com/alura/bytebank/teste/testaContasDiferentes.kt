import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {
    val alex = Cliente("Alex","111.111.111-11",1)
    val fram = Cliente("Alex","111.111.111-11",1)
    val maria = Cliente("Alex","111.111.111-11",1)

    val contaCorrente = ContaCorrente(alex, 1000)
    val contaPoupanca = ContaPoupanca(fram, 1001)
    val contaSalario = ContaSalario(maria, 1002)

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

    contaCorrente.transfere(100.0, contaSalario, 1)

    println("Saldo apos transferencia corrente -> salario")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
    contaSalario.saldo.also(::println)

    contaPoupanca.transfere(100.0, contaSalario, 1)

    println("Saldo apos transferencia poupanca -> salario")
    contaCorrente.saldo.also(::println)
    contaPoupanca.saldo.also(::println)
    contaSalario.saldo.also(::println)

    // contaSalario.transfere(100.0, contaCorrente)
}