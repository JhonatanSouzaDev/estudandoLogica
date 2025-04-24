package `03`

fun main() {

    println("Informe um número: ")
    val n = readln().toInt()

    for (i in 1..n) {
        println("Tabuada do $i: ")
        for (j in 1..10) {
            println("$i X $j = ${n * j}")
        }
        println()
    }
}