package br.com.micael.collections

fun main() {
    val bancoDeNomes = BancoDeNomes()
    val nomesSalvos: Collection<String> = bancoDeNomes.nomes
    bancoDeNomes.salva("Alex")

    println(bancoDeNomes.nomes)
    println(nomesSalvos)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
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