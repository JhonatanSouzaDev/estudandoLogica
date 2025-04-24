package `03`

//entendo que usar Thread não é recomendado, usa- se Coroutines, que é mais leve e mais seguro.

fun main() {

    for (i in 30 downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    print("BOOOOM!")
}