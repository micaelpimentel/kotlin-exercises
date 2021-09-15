import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val objeto: Any = Any()

    imprime(objeto)
    imprime(12)
    imprime(22.2)

    val teste = imprime(Endereco())
    println(teste)

    testaFuncionario()
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}

fun imprime(valor: Int) {

}

fun imprime(valor: Double) {

}