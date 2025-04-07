package `02`

fun main() {

    println("Informe o primeiro valor inteiro: ")
    val valor1 = readln().toInt()

    println("Informe o segundo valor inteiro: ")
    val valor2 = readln().toInt()

    println("Escolha uma das opção: ")
    println("1. Adição")
    println("2. Subtração")
    println("3. Divisão")
    println("4. Multiplicação")

    val operacao = readln().toInt()

    val resultado = when (operacao) {

        1 -> valor1 + valor2
        2 -> valor1 - valor2
        3 -> if (valor2 != 0) valor1 / valor2 else "Erro: Divisão por 0"
        4 -> valor1 * valor2
        else -> "Operação inválida"
    }

println("Resulta: $resultado")
}