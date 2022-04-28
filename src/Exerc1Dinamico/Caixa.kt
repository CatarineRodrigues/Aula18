package Exerc1Dinamico

import kotlin.system.exitProcess

class Caixa() {
    var listaProdutos: ArrayList<Produto> = ArrayList()

    fun bemVindo() {
        println("\n---------------------------------------------")
        println("Bem vindo ao nosso sistema de compras Online")
        println("---------------------------------------------")
    }

    fun menuMercado() {
        println("---------------------------------")
        println("1 - Inserir produtos no carrinho")
        println("2 - Exibir produtos do carrinho")
        println("3 - Exibir valor total da compra")
        println("4 - Sair")
        println("---------------------------------")
        when (readln().toInt()) {
            1 -> {
                novaCompra()
                menuMercado()
            }
            2 -> {
                exibirLista()
                menuMercado()
            }
            3 -> {
                exibirValorTotalLista()
                menuMercado()
            }
            4 -> {
                println("Obrigado! Volte logo!")
                exitProcess(0)
            }
            else -> {
                println("Opção inválida! Tente novamente")
                menuMercado()
            }
        }
    }

    fun novaCompra() {
        cadastrarProdutos()
        println("Deseja cadastrar um novo produto? \n 1-Sim ou 2-Não")
        var opcao = 0
        while (opcao != 1 || opcao != 2) {
            opcao = readln().toInt()
            when (opcao) {
                1 -> {
                    println("1-Sim")
                    novaCompra()
                }
                2 -> {
                    println("2-Não")
                    break
                }
                else -> println("Opção inválida!")
            }
        }
    }

    fun cadastrarProdutos() {
        println("Qual o nome do produto a ser comprado?")
        var nomeProduto = readln()
        println("Qual o valor unitário do produto a ser comprado?")
        var valorProdut = readln().toDouble()
        println("Qual quantidade do produto a ser comprado?")
        var qntidProduto = readln().toInt()

        listaProdutos.add(Produto(nomeProduto, valorProdut, qntidProduto))
        println("Produto cadastrado")
    }

    fun exibirLista() {
        println("\n----------PRODUTOS NO CARRINHO----------")
        listaProdutos.forEach {
            it.exibirProdutosCadastrados()
        }
    }

    fun exibirValorTotalLista() {
        var soma = 0.0
        println("\n---------------CAIXA FINAL---------------")
        listaProdutos.forEach { produto ->
            soma += produto.qntidProduto * produto.valor
        }
        println("A soma total da compra foi de R$ $soma")
    }
}