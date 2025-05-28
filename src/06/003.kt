package `06`

val alunosNomes = mutableListOf<String>()
val alunosNotas = mutableListOf<List<Double>>()

fun main() {
    while (true) {
        println("\nESCOLHA UMA OPÇÃO:\n1. Cadastrar notas\n2. Pesquisar notas\n3. Exibir notas\n4. Sair.")
        when (readln()?.toIntOrNull()) {
            1 -> cadastrarNotas()
            2 -> pesquisarNotas()
            3 -> exibirNotas()
            4 -> return
            else -> println("Opção Inválida.")
        }
    }
}

fun cadastrarNotas() {
    while (alunosNomes.size < 5) {
        println("Nome do Aluno:")
        alunosNomes.add(readln() ?: "")
        println("Digite a nota:")
        val nota = readln().split(" ").map { it.toDoubleOrNull() ?: 0.0 } ?: listOf(0.0, 0.0, 0.0, 0.0)
        alunosNotas.add(nota)
        println("Cadastro feito.\n")
    }
}

fun pesquisarNotas() {
    println("Nome do aluno para pesquisar:")
    val nome = readln() ?: ""
    val index = alunosNomes.indexOf(nome)
    if (index != -1) {
        val media = alunosNotas[index].average()
        val status = if (media >= 5) "Aprovado" else "Reprovado"
        println("Nome: $nome, Notas: ${alunosNotas[index]}, Media: $media, Status: $status")
    } else {
        println("Aluno não encontrado.")
    }
}

fun exibirNotas() {
    if (alunosNomes.isEmpty()) {
        println("Nenhum aluno encontrado.")
    } else {
        println("Lista de alunos:")
        for (i in alunosNomes.indices) {
            val media = alunosNotas[i].average()
            val situacao = if (media >= 5) "Aprovado" else "Reprovado"
            println("Nome: ${alunosNomes[i]}, Notas: ${alunosNotas[i]}, Média: $media, $situacao")
        }
    }
}