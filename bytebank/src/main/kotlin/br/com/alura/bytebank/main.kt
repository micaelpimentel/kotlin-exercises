import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno
import br.com.alura.bytebank.teste.Soma

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

    soma(1,5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autenticacao(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 12534) {
        println("realizar pagamento")
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma acontecendo")
    resultado(a + b)
    println("soma aconteceu")
}