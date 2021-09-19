import br.com.alura.bytebank.modelo.Endereco
import java.lang.ClassCastException

fun main() {
    println("início main")

    val entrada: String = "1.9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa = if (valor != null) {
        valor + 0.1
    } else {
        null
    }.also(::println)

    if (valor != null) {
        println("Valor recebido $valor")
    } else {
        println("Valor invalido")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("Pegou ClassCastException")
        println(e.message)
        e.printStackTrace()
        println(e.cause)
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}