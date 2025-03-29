package `02`

// Maior valor

fun main(){

    print("Informe o primeiro valor: ")
    val valor1 = readln().toInt()

    print("Informe o segundo valor: ")
    val valor2 = readln().toInt()

    print("Informe o terceiro valor: ")
    val valor3 = readln().toInt()

    print("Informe o quarto valor: ")
    val valor4 = readln().toInt()

    val maior = maxOf (valor1, valor2, valor3, valor4)


    println("Primeiro valor: $valor1")
    println("Último valor: $valor4")
    println("Maior valor é: $maior")

}