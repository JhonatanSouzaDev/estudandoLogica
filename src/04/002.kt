package `04`

fun main() {

    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
    val listaPlanetas = """
        
        ====================
        PLANETAS DISPONÍVEIS
        ====================
        
        Terra
        Marte
        Plutão
        Vênus
        Júpiter
        Saturno 
        
    """.trimIndent()

    println(listaPlanetas)
    println("Digite o nome de UM dos planeta: ")
    val nomePlaneta = readln()

    if (planetas.contains(nomePlaneta)) {
        println("$nomePlaneta está na lista de planetas aceitos.")
    } else {
        println("$nomePlaneta não está na lista de planetas aceitos")
    }
}