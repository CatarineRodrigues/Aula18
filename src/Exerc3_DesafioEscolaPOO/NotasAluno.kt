package Exerc3_DesafioEscolaPOO

class NotasAluno {

    var sistemaEscola: SistemaEscola = SistemaEscola()

    fun cadastroNotasAluno(): DoubleArray {
        val listaNotas = DoubleArray(4)
        for (i in listaNotas.indices) {
            println("Escreva a nota que o aluno teve na ${i + 1}º prova")
            val notaAluno = readln().toDouble()
            listaNotas[i] = sistemaEscola.analisandoNotas(notaAluno)
        }
        return listaNotas
    }
}