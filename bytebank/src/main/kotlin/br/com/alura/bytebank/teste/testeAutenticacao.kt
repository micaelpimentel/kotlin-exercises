import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente("Alex", "1111111111", 1000.0, 1000)
    val diretor = Diretor("Fran", "222222222", 2000.0, 2000, 200.0)
    val cliente = Cliente("Gui", "333.333.333-33", 1234)
    
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1020)
    sistemaInterno.entra(diretor, 2000)
    sistemaInterno.entra(cliente, 1234)
}