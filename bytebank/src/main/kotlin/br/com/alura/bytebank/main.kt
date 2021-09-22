
fun main() {
//    testaTipoFuncaoClasse()
//    testaTipoFuncaoReferencia()

    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (Double) -> Double = lambda@ { salario ->
        if (salario > 1000.0)
            return@lambda salario + 50.0
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1100.0))

    val calculaBonificacaoAnonima = fun(salario: Double): Double {
        if (salario > 1000.0)
            return salario + 50.0
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(950.0))

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