package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autenticacao(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticacao")
        }

        when(admin) {
            is FuncionarioAdmin -> println("Opções admin")
            is Funcionario -> println("Opções comum")
            else -> println("Opções reduzidas")
        }
    }
}