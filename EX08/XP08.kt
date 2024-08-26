class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo: Int) {

    fun verificarEReporEstoque() {
        if (quantidade < nivelMinimo) {
            reporEstoque()
        }
    }

    private fun reporEstoque() {
        quantidade = nivelMaximo
        println("Estoque do produto '$nome' reposto para o nível máximo de $nivelMaximo unidades.")
    }
}

fun main() {
    val produtos = mutableListOf<Produto>()

    for (i in 1..5) {
        println("Cadastro do Produto $i:")
        print("Nome: ")
        val nome = readln()
        print("Quantidade disponível: ")
        val quantidade = readln().toInt()
        print("Nível mínimo: ")
        val nivelMinimo = readln().toInt()
        print("Nível máximo: ")
        val nivelMaximo = readln().toInt()

        produtos.add(Produto(nome, quantidade, nivelMinimo, nivelMaximo))
        println()
    }

    println("Verificação e reposição de estoque:")
    produtos.forEach { produto ->
        produto.verificarEReporEstoque()
        println("Produto: ${produto.nome}, Quantidade: ${produto.quantidade}")
    }
}
