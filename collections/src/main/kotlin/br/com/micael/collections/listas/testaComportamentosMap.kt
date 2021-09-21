package br.com.micael.collections.listas

fun testaComportamentosMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 64.0,
        5 to 17.2,
        6 to 64.0
    )

//    println(pedidos.getValue(5))
    pedidos.getOrElse(0) {
        "Não tem o pedido"
    }.also(::println)

    pedidos.getOrDefault(1, 0.0).also(::println)
    pedidos.getOrDefault(7, 0.0).also(::println)

    println(pedidos.keys)

    for (numero in pedidos.keys)
        println("Numero: $numero")

    for (valor in pedidos.values)
        println("Numero: $valor")

    pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 30.0
    }.also(::println)

    pedidos.filterValues {
        it > 30.0
    }.also(::println)

    pedidos.filterKeys {
        it % 2 == 0
    }.also(::println)

    println(pedidos + (7 to 45.8))
    println(pedidos + mapOf(7 to 45.8, 8 to 34.1))
    println(pedidos - 5)
    println(pedidos - listOf(2, 5))

    //pedidos.putAll(listOf(7 to 45.8, 8 to 34.1))
    pedidos += listOf(7 to 45.8, 8 to 34.1)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(64.0)
    println(pedidos)
}