package `03`

fun main(){

    var dentro = 0
    var fora = 0

    for (i in 1..10){
        println("Informe o valor: $i")
        val valor = readln().toInt()

        if (valor in 24..42){
            dentro++
        }else{
            fora++
        }

    }

    println("Valores dentro do intervalo $dentro")
    println("Valores fora do intervalo $fora")
}