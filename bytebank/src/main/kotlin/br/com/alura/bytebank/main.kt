import br.com.alura.bytebank.modelo.Endereco

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 4123)
//
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)

    val enderecoMaiusculo = Endereco(logradouro = "rua vergueiro", numero = 4123).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.also(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco -> !endereco.complemento.isNullOrEmpty() }
        .also(::println)
}