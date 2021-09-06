class Funcionario(
    val nome: String,
    val cpf: Long,
    val salario: Double
) {
    fun bonificacao() = salario * 0.1
}