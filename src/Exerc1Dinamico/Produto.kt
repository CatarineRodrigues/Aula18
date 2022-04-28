package Exerc1Dinamico

class Produto(                    //construtor com o q todos os produtos devem ter
    var nome: String = "",
    var valor: Double = 0.0,
    var qntidProduto: Int = 0
) {
    fun exibirProdutosCadastrados() {
        println("Produto: $nome \n---Quantidade: $qntidProduto --- Valor unitário: R$ $valor --- Valor total: R$ ${qntidProduto * valor}")
    }
}