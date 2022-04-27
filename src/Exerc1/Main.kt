package Exerc1

/*
classe caixa recebe produtos e cadastra na lista
exibe os produtos cadastrados nessa lista
soma os valores da lista

classe produtos  atributos nome, valor, qntidade

no main criar 5 objetos produto -> estático ou dinâmico
1 objeto caixa realizar as ações de cadastro, exibir e exibir valor total
*/

fun main() {
    var produtoLeite: Produto = Produto("leite", 4.35, 6)
    var produtoPao: Produto = Produto("Pão de forma", 5.50, 1)
    var produtoManteiga: Produto = Produto("Manteiga", 5.00, 1)
    var produtoArroz: Produto = Produto("Arroz", 20.00, 1)
    var produtoFeijao: Produto = Produto("Feijao", 10.00, 1)

    var caixa: Caixa = Caixa()
    caixa.cadastrarProdutos(produtoLeite)
    caixa.cadastrarProdutos(produtoPao)
    caixa.cadastrarProdutos(produtoManteiga)
    caixa.cadastrarProdutos(produtoArroz)
    caixa.cadastrarProdutos(produtoFeijao)

    caixa.exibirProdutosCadastrados()
    caixa.exibirValorTotalLista()

}