package br.com.micael.collections.listas

fun trabalhandoComListas() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "Joao Guimaraes Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "Joao Guimaraes Rosa",
            anoPublicacao = 1946
        )
    )
    livros.imprimeComMarcadores()
    //livros.remove(livro1)
    livros.imprimeComMarcadores()

    livros.sorted().imprimeComMarcadores()

    livros.sortedBy { it.titulo }.imprimeComMarcadores()
    livros.sortedBy { it.autor }.imprimeComMarcadores()

    livros
        .filter { it.autor.startsWith("Joao") }
        .map { it.titulo }
        .also(::println)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("#### Lista de Livros ####\n$textoFormatado")
}