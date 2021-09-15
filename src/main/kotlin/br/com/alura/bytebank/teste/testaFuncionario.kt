import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionario() {
    val alex = Analista(
        nome = "Alex",
        cpf = "123.123.123-93",
        salario = 1000.0,
        senha = 1000
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificaçao ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "987.654.321-00",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificaçao ${fran.bonificacao}")

    if (fran.autenticacao(1234))
        println("Autenticado com sucesso")
    else
        println("Falha ao autenticar")

    val maria = Diretor(
        nome = "maria",
        cpf = "987.654.321-00",
        salario = 4000.0,
        senha = 6543,
        plr = 200.0
    )

    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("bonificaçao ${maria.bonificacao}")
    println("plr ${maria.plr}")

    if (maria.autenticacao(1234))
        println("Autenticado com sucesso")
    else
        println("Falha ao autenticar")

    val gui = Analista(
        nome = "Gui",
        cpf = "444.444.444-44",
        salario = 3000.0,
        senha = 2000
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(maria)
    calculadora.registra(gui)

    println("total de bonificaçao: ${calculadora.total}")
}