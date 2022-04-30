package Exerc2

import java.time.LocalDate

class Pessoa(
    private var nome: String = "",
    private var diaNascimento: Int = 0,
    private var mesNascimento: Int = 0,
    private var anoNascimento: Int = 0
) {
    private var idade = 0
    private var diaAtual = LocalDate.now().dayOfMonth
    private var mesAtual = LocalDate.now().monthValue
    private var anoAtual = LocalDate.now().year

    fun calcularIdade() {
        idade = (anoAtual - anoNascimento)
        when {
            (mesAtual == mesNascimento && (diaAtual < diaNascimento))-> idade -= 1
            (mesAtual == mesNascimento && (diaAtual >= diaNascimento)) -> idade
            mesAtual > mesNascimento -> idade
            mesAtual < mesNascimento -> idade -= 1
        }
    }

    fun informarIdade() {
        return println("A idade de $nome hoje: $idade anos")
    }

    fun informarNome() {
        return println("Cálculo da idade de $nome")
    }

    fun ajustaDataDeNascimento() {
        println("Insira o nome")
        nome = readln()
        println("Insira o dia do nascimento de $nome")
        diaNascimento = readln().toInt()
        println("Insira número correspondente ao mês do nascimento de $nome")
        mesNascimento = readln().toInt()
        println("insira o ano do nascimento de $nome")
        anoNascimento = readln().toInt()
    }
}