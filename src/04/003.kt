package `04`

fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Manga", "Uva")

    while (frutas.isNotEmpty()) {
        println("Lista de frutas disponíveis:\n${frutas.joinToString("\n")}")
        println("Digite o nome de uma fruta para remover (ou Sair para encerrar)")
        val frutaParaRemover = readln()

        if (frutaParaRemover.uppercase() == "SAIR") {
            break
        }
        if (frutas.contains(frutaParaRemover)) {
            frutas.remove(frutaParaRemover)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível em nosso mercado.")
        }

    }

    println("Lista de compras finalizada")

}

