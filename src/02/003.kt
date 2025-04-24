package `02`

fun main(){
    println("Informe o primeiro valor: ")
    val valor1 = readln().toInt()

    println("Informe o segundo valor: ")
    val valor2 = readln().toInt()

    println("informe o terceiro valor: ")
    val valor3 = readln().toInt()

    val maior = when{
        valor1 > valor2 && valor1 > valor3 -> valor1
        valor2 > valor1 && valor2 > valor3 -> valor2
        else -> valor3
    }
    println("O maior valor é: $maior.")
}