fun verificaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.alura.bytebank.modelo.Conta positiva")
        saldo == 0.0 -> println("br.com.alura.bytebank.modelo.Conta neutra")
        else -> println("br.com.alura.bytebank.modelo.Conta negativa")
    }
}