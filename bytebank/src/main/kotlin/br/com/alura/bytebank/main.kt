
fun main() {
    val minhaFuncaoLambda = {
        println("Executa com o lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun(){
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do teste")
    }
}