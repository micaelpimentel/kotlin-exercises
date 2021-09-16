import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    ).also(::println)
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    ).also(::println)

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
}