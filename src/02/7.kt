package `02`

fun main(){

    val numeros = IntArray(6)
    var soma = 0

    for (i in 0 until 6){
        println("Informe o ${i + 1}º valor: ")
        val numero = readln().toInt()
        numeros[i] = numero

        if(numero < 72){
            soma += numero
        }
    }

    println("Valores informados: ")
    for(numero in numeros){
        println(numero)
    }

    println("A soma dos valores inferiores a 72 é: $soma")
}