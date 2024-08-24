fun main() {
    // Contexto: Carlos está criando uma ferramenta matemática para verificar se um número é
    // primo. Ele gostaria de automatizar essa tarefa para números fornecidos por usuários.
    // Instruções: Escreva um programa que leia um número inteiro e determine se ele é primo
    // ou não. O programa deve exibir uma mensagem indicando se o número é primo.
    fun verifyPrimeNumber(num: Int) {
        var cont = 0
        for (i in 2..(num / 2) - 1) {
            if (num % i == 0) {
                cont++
            }
        }
        if (cont > 0) {
            println("Número não primo")
        } else {
            println("Número primo")
        }
    }
    verifyPrimeNumber(139)
}
