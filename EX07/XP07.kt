
class Voo(
    val numeroDoVoo: String,
    private val assentosDisponiveis: IntArray
) {
    fun reservarAssento(assento: Int): Boolean {
        if (assento in assentosDisponiveis.indices && assentosDisponiveis[assento] == 1) {
            assentosDisponiveis[assento] = 0 
            return true
        }
        return false
    }

    fun verificarDisponibilidade(assento: Int): Boolean {
        return assento in assentosDisponiveis.indices && assentosDisponiveis[assento] == 1
    }

    fun exibirAssentos() {
        println("Assentos disponíveis para o voo $numeroDoVoo:")
        assentosDisponiveis.forEachIndexed { index, status ->
            val disponibilidade = if (status == 1) "Disponível" else "Reservado"
            println("Assento ${index + 1}: $disponibilidade")
        }
    }
}

fun main() {
    val voo = Voo("1234", IntArray(10) { 1 })

    while (true) {
        println("\nMenu:")
        println("1. Verificar disponibilidade de assento")
        println("2. Reservar assento")
        println("3. Exibir todos os assentos")
        println("4. Sair")

        print("Escolha uma opção: ")
        when (readln().toInt()) {
            1 -> {
                print("Digite o número do assento para verificar: ")
                val assento = readln().toInt() - 1
                if (voo.verificarDisponibilidade(assento)) {
                    println("O assento ${assento + 1} está disponível.")
                } else {
                    println("O assento ${assento + 1} não está disponível.")
                }
            }
            2 -> {
                print("Digite o número do assento para reservar: ")
                val assento = readln().toInt() - 1
                if (voo.reservarAssento(assento)) {
                    println("Assento ${assento + 1} reservado com sucesso.")
                } else {
                    println("Falha ao reservar o assento ${assento + 1}. Pode estar ocupado ou inválido.")
                }
            }
            3 -> {
                voo.exibirAssentos()
            }
            4 -> {
                println("Saindo...")
                return
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }
}
