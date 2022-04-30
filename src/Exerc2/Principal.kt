package Exerc2

fun main() {

    val einstein: Pessoa = Pessoa("AlbertEinstein", 14, 3, 1879)
    einstein.informarNome()
    einstein.calcularIdade()
    einstein.informarIdade()

    val newton: Pessoa = Pessoa("Isaac Newton", 4, 1, 1643)
    newton.informarNome()
    newton.calcularIdade()
    newton.informarIdade()

    val pessoaNova: Pessoa = Pessoa()
    pessoaNova.ajustaDataDeNascimento()
    pessoaNova.informarNome()
    pessoaNova.calcularIdade()
    pessoaNova.informarIdade()
}