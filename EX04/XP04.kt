class ListaAlunos {
    fun lerEOrdenarAlunos() {
        val alunos = Array(10) { "" }

        println("Digite o nome de 10 alunos:")

        for (i in alunos.indices) {
            print("Nome do aluno #${i + 1}: ")
            alunos[i] = readln()
        }

        alunos.sort()

        println("\nLista de alunos em ordem alfabética:")
        for (nome in alunos) {
            println(nome)
        }
    }
}

fun main() {
    val listaAlunos = ListaAlunos()

    listaAlunos.lerEOrdenarAlunos()
}
