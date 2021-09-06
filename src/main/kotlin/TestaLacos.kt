fun testaLacos() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..1000) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
    var i = 0
    while (i < 5) {
        val titular = "Fulano $i"
        val conta = 1000 + i
        var saldo = 10.0 + i

        saldo *= i

        println("Titular: $titular")
        println("Conta: $conta")
        println("Saldo: $saldo")

        verificaCondicao(saldo)
        println()
        i++
    }
    for (i in 5 downTo 1) {
        if (i == 4)
            continue

        val titular = "Fulano $i"
        val conta = 1000 + i
        var saldo = 10.0 + i

        saldo *= i

        println("Titular: $titular")
        println("Conta: $conta")
        println("Saldo: $saldo")

        verificaCondicao(saldo)
        println()
    }
}