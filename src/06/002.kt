package `06`

val nomesAltura = mutableListOf<String>()
val alturasPessoas = mutableListOf<Double>()

fun main() {
    while (true) {
        println("\nMenu de nome e altura:")
        println("1. Cadastrar 5 pessoas.")
        println("2. Mostrar pessoas com altura menor ou igual a 1,5m")
        println("3. Mostrar pessoas com altura maior que 1,5m")
        println("4. Mostrar pessoas entre 1,5m e 2,0m")
        println("5. Calcular e apresentar a média das alturas.")
        println("6. Sair")
        println("Escolha uma opção:")

        when (readln()?.toIntOrNull()) {
            1 -> cadastrarPessoasAltura()
            2 -> mostrarBaixas()
            3 -> mostrarAltas()
            4 -> mostrarAltasEntre()
            5 -> calcularMediasAlturas()
            6 -> return
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

fun cadastrarPessoasAltura() {
    for (i in 1..5) {
        println("Digite o nome da pessoa $i: ")
        val nome = readln() ?: ""
        println("Digite a altura da pessoa $i (em metros): ")
        val altura = readln()?.toDoubleOrNull() ?: 0.0
        nomesAltura.add(nome)
        alturasPessoas.add(altura)
    }
}

fun mostrarBaixas() {
    println("\nPessoas com altura menor ou igual a 1,5m:")
    for (i in nomesAltura.indices) {
        if (alturasPessoas[i] <= 1.5) {
            println("${nomesAltura[i]} - ${alturasPessoas[i]}m")
        }
    }
}

fun mostrarAltas() {
    println("\nPessoas com altura maior que 1,5m:")
    for (i in nomesAltura.indices) {
        if (alturasPessoas[i] > 1.5) {
            println("${nomesAltura[i]} - ${alturasPessoas[i]}m")
        }
    }
}

fun mostrarAltasEntre() {
    println("\nPessoas com altura entre 1,5m e 2,0m")
    for (i in nomesAltura.indices) {
        if (alturasPessoas[i] > 1.5 && alturasPessoas[i] < 2.0) {
            println("${nomesAltura[i]} - ${alturasPessoas[i]}m")
        }
    }
}

fun calcularMediasAlturas() {
    if (alturasPessoas.isNotEmpty()) {
        val media = alturasPessoas.sum() / alturasPessoas.size
        println("A média das alturas das pessoas é $media")
    } else {
        println("Nem uma pessoa cadastrada.")
    }
}