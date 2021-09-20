package br.com.micael.collections.arrays.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun testaBigDecimals() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "3600.00", "5000.00", "7650.00", "10000.00")
    println(salarios.contentToString())
    val aumento = "1.1".toBigDecimal()
    val meses = "6".toBigDecimal()

    salarios.apply {

        map { salario -> calculaAumento(salario, aumento) }.also(::println)
        map { salario -> calculaAumentoRelativo(salario, aumento) }.also(::println)

        sumOf{ it }.also(::println)
        somatorio().also(::println)
        fold(somatorio()) { acc, valor ->
            acc + (valor * meses).setScale(2, RoundingMode.UP)
        }.also(::println)
    }
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario > "5000".toBigDecimal())
        salario * aumento
    else
        salario + "500".toBigDecimal()
}

fun calculaAumento(salario: BigDecimal, aumento: BigDecimal) = salario * aumento

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) {
        values[it].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatorio(): BigDecimal {
    return this.reduce { acc, valor ->
        acc + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty())
        BigDecimal.ZERO
    else
        this.somatorio() / this.size.toBigDecimal()
}