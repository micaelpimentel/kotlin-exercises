import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {
    val enderecoNulo: Endereco? = Endereco(bairro = "Alvorada", complemento = "Predio")
    enderecoNulo?.let {
        println(it.bairro.length)
        val complementotamanho: Int = it.complemento?.length ?: throw IllegalStateException("Complemento nao pode ser vazio")
        println(complementotamanho)
    }

    teste(1)
    teste("")
}

fun teste(num: Any) {
    val numero = num as? Int
    println(numero)
}