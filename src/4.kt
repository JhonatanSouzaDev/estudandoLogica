import kotlin.math.PI

fun main() {

//retângulo
    println("Digite a base do retângulo: ")
    val base = readln().toDouble()

    println("Digite a altura: ")
    val altura = readln().toDouble()

    val arearetangulo = base * altura

    println("A área do retângulo é: $arearetangulo")


    //quadrado
    println("Digite um lado do quadrado: ")
    val lado1 = readln().toDouble()

    println("Digite o outro lado do quadrado: ")
    val lado2 = readln().toDouble()

    val areaquadrado = lado1 * lado2

    println("A área do quadrado é: $areaquadrado")


    //losango
    println("Digite a diagonal maior do losango: ")
    val diagonalmaior = readln().toDouble()

    println("Digite a diagonal menor: ")
    val diagonalmenor = readln().toDouble()

    val arealosango = (diagonalmaior * diagonalmenor) / 2
    println("A área do losango é: $arealosango")


    //trapézio
    println("Digite a base maior do trapézio: ")
    val basemaior: Double = readln().toDouble()

    println("Digite a base menor: ")
    val basemenor = readln().toDouble()

    println("Digite a altura: ")
    val altura2 = readln().toDouble()

    val areatrapezio = (basemaior + basemenor) * altura2 / 2
    println("A área do trapézio é: $areatrapezio")


    //paralelograma
    println("Digite a base do paralelograma: ")
    val base2 = readln().toDouble()

    println("Digite a altura: ")
    val altura3 = readln().toDouble()

    val areaparalelograma = base2 * altura3

    println("A área do paralelograma é $areaparalelograma")


    //triângulo
    println("Digite a base do triângulo: ")
    val base3 = readln().toDouble()

    println("Digite a altura: ")
    val altura4 = readln().toDouble()

    val areatriangulo = (base3 * altura4) / 2

    println("A área do triângulo é $areatriangulo")


    //circulo
    println("Digite o raio do circulo: ")
    val raio = readln().toDouble()

    val areacirculo = PI * raio * raio

    println("A área do circulo é $areacirculo")


}