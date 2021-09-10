abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {
    abstract val bonificacao: Double

    open fun autenticacao(senha: Int) = this.senha == senha
}