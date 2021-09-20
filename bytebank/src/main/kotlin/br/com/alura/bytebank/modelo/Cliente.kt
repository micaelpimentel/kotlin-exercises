package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    val endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autenticacao(senha: Int) = this.senha == senha
}