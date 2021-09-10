class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autenticacao(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticacao")
        }
    }
}