package Exerc2

class Pessoa(
    private var nome: String = "",
    private var diaNascimento: Int = 0,
    private var mesNascimento: Int = 0,
    private var anoNascimento: Int = 0
) {
    private var idade: Int = 0
    private var diaAtual = 28
    private var mesAtual = 4
    private var anoAtual = 2022

    fun calcularIdade() {
        idade = (anoAtual - anoNascimento)
        when {
            ((mesAtual > mesNascimento) && diaAtual < diaNascimento || diaAtual >= diaNascimento) -> idade
            ((mesAtual < mesNascimento) && diaAtual < diaNascimento || diaAtual > diaNascimento) -> idade -= 1
            (mesAtual == mesNascimento && (diaAtual < diaNascimento))-> idade -= 1
            (mesAtual == mesNascimento && (diaAtual >= diaNascimento)) -> idade
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
