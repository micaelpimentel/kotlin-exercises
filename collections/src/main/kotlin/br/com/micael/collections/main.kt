package br.com.micael.collections

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )
    println(pedidos)

    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidosMapeados[3])

    val pedidosComFreteGratis = pedidos.associateWith {
        it.valor > 50.0
    }
    println(pedidosComFreteGratis)
    println(pedidosComFreteGratis[Pedido(numero = 1, valor = 60.0)])
}

data class Pedido(val numero: Int, val valor: Double)