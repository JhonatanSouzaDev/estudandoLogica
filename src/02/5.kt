package `02`

fun main() {

    print("Informe o primeiro valor: ")
    val valor1 = readln().toInt()


    print("Informe o segundo valor: ")
    val valor2 = readln().toInt()


    print("Informe o terceiro valor: ")
    val valor3 = readln().toInt()


    print("Informe o quarto valor: ")
    val valor4 = readln().toInt()


    print("Informe o quinto valor: ")
    val valor5 = readln().toInt()


    print("Informe o sexto valor: ")
    val valor6 = readln().toInt()

    print("Os valores escolhidos são: ")
    print("$valor1, ")
    print("$valor2, ")
    print("$valor3, ")
    print("$valor4, ")
    print("$valor5, ")
    println("$valor6. ")

    val soma = valor1 + valor2 + valor3 + valor4 + valor5 + valor6
    val media = soma / 6.0

    println("A média aritimética dos valores é: $media")
}