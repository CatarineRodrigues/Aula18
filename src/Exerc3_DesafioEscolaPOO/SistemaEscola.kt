package Exerc3_DesafioEscolaPOO

import kotlin.system.exitProcess

class SistemaEscola {

    fun sistamaEscola() {
        println("\n-----------------------------------------------------")
        println("Bem vindo ao nosso sistema de notas da Escola SimCity")
        println("-----------------------------------------------------")
        val notasAlunos = NotasAluno()
        val listaNotas = notasAlunos.cadastroNotasAluno()
        val media = calculoMedia(listaNotas)
        println("A média semestral do aluno foi $media")

        perguntaExecutarNovamente()
    }

    private fun calculoMedia(listaNotas: DoubleArray): Double {
        var media = 0.0
        listaNotas.forEachIndexed { index, _ ->
            media += listaNotas[index]
        }
        return media / 4
    }

    fun analisandoNotas(notaAluno: Double): Double {
        var analiseNota = notaAluno
        while (analiseNota !in 0.00 .. 10.00){
            println("Nota inválida! Insira um valor entre 0 e 10")
            analiseNota = readln().toDouble()
        }
        println("Nota cadastrada")
        return analiseNota
    }

    private fun perguntaExecutarNovamente() {
        println("\nDeseja fazer um novo cálculo? \n1-sim 2-nao")
        when (readln().toInt()) {
            1 -> sistamaEscola()
            2 -> encerrarSistema()
            else -> perguntaExecutarNovamente()
        }
    }

    private fun encerrarSistema() {
        println("Obrigado por usar nosso sistema!")
        exitProcess(0)
    }
}