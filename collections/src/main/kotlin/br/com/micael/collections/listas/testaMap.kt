package br.com.micael.collections.listas

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[2]
    pedido?.let {
        println(pedido)
    }

    for (p in pedidos) {
        println("Numero do pedido ${p.key}, valor: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 23.0
    println(pedidos)

    pedidos.putIfAbsent(6, 43.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 2.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 30.0)
    println(pedidos)
}