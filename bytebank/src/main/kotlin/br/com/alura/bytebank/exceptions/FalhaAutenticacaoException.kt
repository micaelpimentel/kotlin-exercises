package br.com.alura.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticaçao"
) : Exception(mensagem) {
}