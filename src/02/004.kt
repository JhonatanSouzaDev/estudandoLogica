package `02`

fun main () {
println("Informe o primeiro valor: ")
    val valor1 = readln().toInt()

    println("Informe o segundo valor: " )
    val valor2 = readln().toInt()

    println("Informe o terceiro valor: ")
    val valor3 = readln().toInt()

    val maior: Int
    val segundomaior: Int

    if(valor1 > valor2){
        if(valor1 > valor3){
            maior = valor1
            segundomaior = if (valor2 > valor3) valor2 else valor3

        }else {
            maior = valor3
            segundomaior = valor1
        }
    }else {
        if(valor2 > valor3){
            maior = valor2
            segundomaior = if (valor1 > valor3) valor1 else valor3
        }else {
            maior = valor3
            segundomaior = valor2
        }
    }

    val somaDosDoisMaiores = maior + segundomaior
    println("A soma dos dois maiores valores é: $somaDosDoisMaiores")
}