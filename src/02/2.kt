package `02`

fun main() {
    println("Informe um valor: ")

    val valor = readln().toInt()

    when {
        valor > 0 -> println("O valor é positivo.")
        valor < 0 -> println("O valor é negativo.")
        else -> println("O valor é zero")
    }
}