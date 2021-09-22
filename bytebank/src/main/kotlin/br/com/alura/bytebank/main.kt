
fun main() {
//    testaTipoFuncaoClasse()
//    testaTipoFuncaoReferencia()

    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int{
        return a + b
    }
    println(minhaFuncaoAnonima(13, 8))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse = Soma()
    println(minhaFuncaoClasse(2, 7))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::soma
    println(minhaFuncao(3, 4))
}

fun soma(a: Int, b: Int) = a + b

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}