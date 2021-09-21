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

//    val mapa = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Alex", "Fran", "Ana", "Gui", "Paulo", "Maria", "Mario", "Gisele")
    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
}

data class Pedido(val numero: Int, val valor: Double)