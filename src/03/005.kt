package `03`

fun main() {

    println("Informe o primeiro número inteiro (menor): ")
    val primeiroNumero = readln().toInt()

    println("Informe o segundo número inteiro (MAIOR)")
    val segundoNumero = readln().toInt()

    if (primeiroNumero > segundoNumero) {
        println("O primeiro número deve ser menor que o segundo número")
        return
    }
    var soma = 0
    var quantidade = 0

    for (i in primeiroNumero..segundoNumero) {
        soma += i
        quantidade++
    }
    val media = soma.toDouble() / quantidade
    println("A média aritimética de $primeiroNumero e $segundoNumero é de $media")

}