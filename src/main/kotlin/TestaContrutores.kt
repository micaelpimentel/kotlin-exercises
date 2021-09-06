fun testaContrutores() {
    val pessoa1 = Person("Micael")
    val pessoa2 = Person("Nicolas", pessoa1)
    val pessoa3 = Person("Manfred", pessoa1)
    println(pessoa1.name)
    pessoa1.children.forEach { it.name.also(::println) }
}