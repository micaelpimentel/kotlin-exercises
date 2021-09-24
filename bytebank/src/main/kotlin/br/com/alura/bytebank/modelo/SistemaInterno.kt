package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(
        admin: Autenticavel,
        senha: Int,
        autenticado: () -> Unit = {}
    ) {
        if (admin.autenticacao(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticacao")
        }

//        when(admin) {
//            is FuncionarioAdmin -> println("Opções admin")
//            is Funcionario -> println("Opções comum")
//            else -> println("Opções reduzidas")
//        }
    }

    fun entraReceiver(
        admin: Autenticavel,
        senha: Int,
        autenticado: SistemaInterno.() -> Unit = {}
    ) {
        if (admin.autenticacao(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticacao")
        }
    }

    fun pagamento() {
        println("realizando pagamento")
    }
}