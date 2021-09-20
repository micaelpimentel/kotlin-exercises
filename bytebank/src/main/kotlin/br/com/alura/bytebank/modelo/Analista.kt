package br.com.alura.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override val bonificacao: Double
        get() = salario * 0.1

    override fun autenticacao(senha: Int) = senha == this.senha
}