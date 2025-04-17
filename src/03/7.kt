fun main() {

    val totalNotas = 6
    var soma = 0.0

    for (i in 1..totalNotas) {
        var notaValida = false
        while (!notaValida) {
            println("Informe a nota $i (entre 0 e 10)")
            val nota = readln().toDoubleOrNull()

            if (nota != null && nota in 0.0..10.0) {
                soma += nota
                notaValida = true
            }else{
                println("Nota inválida. Por favor, informe um valor de 0 a 10.")
            }
        }
    }

    val media = soma / totalNotas
    println("A média das notas é: $media")
}