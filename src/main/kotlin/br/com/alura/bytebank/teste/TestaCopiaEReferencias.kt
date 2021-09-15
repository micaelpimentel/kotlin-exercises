import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiaEReferencias() {
    var numerox = 10
    var numeroy = numerox
    numeroy++

    println(numerox)
    println(numeroy)

    val joao = Cliente("Joao", "", 1)
    val contaJoao = ContaCorrente(joao, 2000)
    val contaMaria = contaJoao

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}