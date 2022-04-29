package Exerc2

fun main() {

    var einstein: Pessoa = Pessoa("AlbertEinstein", 14, 5, 1879)
    einstein.informarIdade()
    einstein.calcularIdade()
    einstein.informarIdade()

    var newton: Pessoa = Pessoa("Isaac Newton", 4, 1, 1643)
    newton.informarIdade()
    newton.calcularIdade()
    newton.informarIdade()

    var pessoaNova: Pessoa = Pessoa()
    pessoaNova.ajustaDataDeNascimento()
    pessoaNova.informarNome()
    pessoaNova.calcularIdade()
    pessoaNova.informarIdade()
}