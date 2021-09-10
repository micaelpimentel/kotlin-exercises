fun main() {
    println("Bem vindo ao Bytebank")
    val gerente = Gerente("Alex","1111111111", 1000.0, 1000)
    val diretor = Diretor("Fran", "222222222", 2000.0, 2000, 200.0)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1000)
    sistemaInterno.entra(diretor, 2000)
}