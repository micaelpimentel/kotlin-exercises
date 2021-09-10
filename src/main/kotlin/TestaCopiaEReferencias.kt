fun testaCopiaEReferencias() {
    var numerox = 10
    var numeroy = numerox
    numeroy++

    println(numerox)
    println(numeroy)

    val contaJoao = ContaCorrente("Joao", 2000)
    val contaMaria = contaJoao

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}