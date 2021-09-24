package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaScopeFunctions() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 4123)
//
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)

    val enderecoMaiusculo = Endereco(logradouro = "rua vergueiro", numero = 4123).run {
        "$logradouro, $numero".toUpperCase()
    }.also(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco -> !endereco.complemento.isNullOrEmpty() }
        .also(::println)
}