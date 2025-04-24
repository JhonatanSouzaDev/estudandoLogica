package `02`

fun main(){

    println("Em que ano você nasceu? ")
    val anoNascimento = readln().toInt()

    println("Em que ano estamos? ")
    val anoAtual = readln().toInt()

    val idade = anoAtual - anoNascimento
    println("Você tem $idade anos de idade.")


    if(idade >= 16){
        print("Então já pode votar.")
    }else{
        println("E ainda não pode votar.")
    }
}