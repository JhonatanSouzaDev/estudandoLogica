package `02`

fun main(){

    print("Informe o primeiro número: ")
    val num1 = readln().toInt()

    print("Informe o segundo número: ")
    val num2 = readln().toInt()

    print("Informe o terceiro número: ")
    val num3 = readln().toInt()

    print("Informe o quarto número: ")
    val num4 = readln().toInt()

    if (num1 in 1..9 && num2 in 1..9 && num3 in 1..9 && num4 in 1..9) {
        val media = (num1 + num2 + num3 + num4) / 4
        if (media >= 5)
            println("Aprovado")
        else {
            println("Tente novamente")
        }
    }else{ println("Os números precisam ser de 1 até 9")}

}
