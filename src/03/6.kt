package `03`

fun main(){

    var quantidadeAprovados = 0
    var continuar = true

    while (continuar) {

        println("Informe a primeira nota: ")
        val nota1 = readln().toDouble()

        println("Informe a segunda nota: ")
        val nota2 = readln().toDouble()

        val media = (nota1 + nota2) / 2

        if(media >= 9.5){
            quantidadeAprovados++
        }

        println("Media final é igual a $media")

        println("Deseja calcular a nota de outro aluno? (Sim ou Não)")
        val resposta = readln().trim().lowercase()


        if(resposta != "sim"){
            continuar = false

        }
    }

    println("Quantiadde de alunos aprovados: $quantidadeAprovados")
}