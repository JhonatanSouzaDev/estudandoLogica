package `06`

val nomes = mutableListOf<String>()
val enderecos = mutableListOf<String>()
val telefones = mutableListOf<String>()

fun main() {
    while (true) {
        println(
            "\nEscolha uma opção: \n1. Cadastrar Contatos.\n2. Pesquisar Contatos.\n3. Classificar Contatos." +
                    "\n4. Exibir Contatos.\n5. Sair"
        )
        when (readln()?.toIntOrNull()) {
            1 -> cadastrar()
            2 -> pesquisar()
            3 -> classificar()
            4 -> exibir()
            5 -> return
            else -> println("Opção inválida.")


        }
    }
}

fun cadastrar(){
    while (nomes.size < 10){
        println("Nome:")
        nomes.add(readln()?: "")
        println("Endereço:")
        enderecos.add(readln()?: "")
        println("Telefone:")
        telefones.add(readln()?: "")
        println("Cadastro feito.\n")
    }
}

fun pesquisar() {
    println("Nome para pesquisar:")
    val nome = readln() ?: ""
    val index = nomes.indexOf(nome)
    if (index != -1) {
        println("Encontrado: ${nomes[index]}, ${enderecos[index]}, ${telefones[index]}")
    } else {
        println("Não encontrado.")
    }
}

fun classificar(){
    val listCombinada = nomes.indices.sortedBy { nomes[it] }
    println("Contatos classificados:")
    listCombinada.forEach{ println("${nomes[it]}, ${enderecos[it]}, ${telefones[it]}") }
}

fun exibir(){
    if (nomes.isEmpty()){
        println("Nem um contato cadastrado.")
    }else{
        println("Lista de contatos")
        for (i in nomes.indices){
            println("${nomes[i]}, ${enderecos[i]}, ${telefones[i]}")
        }
    }
}