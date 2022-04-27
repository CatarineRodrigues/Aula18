package Exerc1

class Caixa() {
    var listaProdutos: ArrayList<Produto> = ArrayList()

    fun cadastrarProdutos(produto: Produto) {
        listaProdutos.add(produto)
        println("Produto cadastrado")
    }

    fun exibirProdutosCadastrados() {
        println("\n----------PRODUTOS----------")
        listaProdutos.forEach { produto ->
            println("Produto: ${produto.nome} \n---Quantidade: ${produto.qntidProduto} --- Valor unitário: R$ ${produto.valor} --- Valor total: R$ ${produto.qntidProduto * produto.valor}")
        }
    }

    fun exibirValorTotalLista() {
        var soma = 0.0
        println("\n----------CAIXA FINAL----------")
        listaProdutos.forEach { produto ->
            soma += produto.qntidProduto * produto.valor
        }
        println("A soma total da compra foi de R$ $soma")
    }
}