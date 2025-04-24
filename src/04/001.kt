package `04`

fun main() {

    val estudantes = mutableListOf<String>()

    while (true) {
        println("Digite o nome do estudante (ou 'PARE' para encerrar)")
        val nome = readln()

        if (nome.uppercase() == "PARE") {
            break
        } else {
            estudantes.add(nome)
        }
    }

    println("Quantidade de estudantes cadastrados: ${estudantes.size}\n")
    println("Lista de estudantes: ")

    for (estudante in estudantes)
        println(estudante)
}