package br.com.micael.collections

fun main() {
    val bancoDeNomes = BancoDeNomes()
    //bancoDeNomes.nomes.add("Alex")
    bancoDeNomes.salvo("Alex")
    println(bancoDeNomes.nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = Companion.dados

    fun salvo(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: MutableCollection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    nomes.add("Paulo")
    nomes.remove("Alex")
    nomes.forEach {
        println(it)
    }
    println(nomes)
    println(nomes.contains("Alex"))
    println("Tamanho da coleção: ${nomes.size}")
}