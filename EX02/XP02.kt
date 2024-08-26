fun main() {

    fun countWords(paragraph: String) {
        var wordsArr = paragraph.split("\\s".toRegex())
        println("A frase possui ${wordsArr.size} palavras")
    }

    println("Insira sua frase: ")
    var phrase = readln()
    countWords(phrase)
}
