fun main() {
    println("Bem vindo ao Bytebank")
    val alex = Funcionario(
        nome = "Alex",
        cpf = 12312312393,
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificaçao ${alex.bonificacao()}")
}