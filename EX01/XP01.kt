fun main() {
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
