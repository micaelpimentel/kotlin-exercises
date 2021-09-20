package br.com.micael.collections.listas

class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizaPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizaPorAno(): List<Livro> {
        return this.livros.sortedBy { it.anoPublicacao }
    }
}