package Exerc1

/*
// classe caixa recebe produtos e cadastra na lista
// exibe os produtos cadastrados nessa lista
// soma os valores da lista

classe produtos  atributos nome, valor, qntidade

no main criar 5 objetos produto -> estático ou dinâmico
1 objeto caixa realizar as ações de cadastro, exibir e exibir valor total
*/

class Caixa() {
    var listaProdutos: ArrayList<Produto> = ArrayList()

    fun cadastrarProdutos(produto: Produto) {
        listaProdutos.add(produto)
        println("Produto cadastrado")
    }

    fun exibirProdutosCadastrados() {
        println("\n----------PRODUTOS----------")
        listaProdutos.forEach { produto ->
            println("Produto: ${produto.nome} \n---Quantidade: ${produto.qntidProduto} --- Valor unitário: ${produto.valor} --- Valor total: ${produto.qntidProduto * produto.valor}")
        }
    }

    fun exibirValorTotalLista() {
        var soma = 0.0
        println("\n----------CAIXA FINAL----------")
        listaProdutos.forEach { produto ->
            soma += produto.qntidProduto * produto.valor
        }
        println("A soma total da compra foi de $soma")
    }
}