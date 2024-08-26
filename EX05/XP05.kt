import kotlin.random.Random

class Dados {
    private val random = Random.Default

    fun lançarDados(): Int {
        val dado1 = random.nextInt(1, 7)
        val dado2 = random.nextInt(1, 7)
        return dado1 + dado2
    }
}

class Simulador {
    private val dados = Dados()

    fun iniciar() {
        print("Quantas vezes deseja lançar os dados? ")
        val numLançamentos = readln().toInt()

        println("\nResultados dos lançamentos:")

        for (i in 1..numLançamentos) {
            val soma = dados.lançarDados()
            println("Lançamento #$i: $soma")
        }
    }
}

fun main() {
    val simulador = Simulador()

    simulador.iniciar()
}
