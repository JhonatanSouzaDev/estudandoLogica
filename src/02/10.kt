package `02`

fun main() {

    println("Qual a sua altura? ")
    val altura = readln().toDouble()

    println("Qual seu gênero (1 para feminino, 2 para masculino)")
    val genero = readln().toInt()

    val pesoIdeal = when (genero) {
        1 -> 62.1 * altura - 44.7
        2 -> 72.7 * altura - 58
        else -> {
            println("O gênero está incorreto")
            return
        }
    }
    println("O peso ideal é: %.2f kg".format(pesoIdeal))
}