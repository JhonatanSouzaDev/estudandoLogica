package `05`

import kotlin.system.exitProcess

var saldo = 100.5f
val extrato = mutableListOf(
    "Deposito inicial de 100.5",
    "Compra no supermercado de 45.75",
    "Deposito de 200.0",
    "Compra online de 30.0"
)

const val senha = 123

fun main() {
    print("Qual seu nome? ")
    val nome = readln()
    print("Seja bem vindo $nome! ")
    inicio(nome)
}

fun inicio(nome: String) {
    println("Escolha uma opção")
    println("1. Ver Saldo")
    println("2. Ver Extrato")
    println("3. Fazer Saque")
    println("4. Fazer Depósito")
    println("5. Fazer Transferência")
    println("6. Sair")

    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> verSaldo(nome)
        2 -> verExtrato(nome)
        3 -> fazerSaque(nome)
        4 -> fazerDeposito(nome)
        5 -> fazerTransferencia(nome)
        6 -> sair(nome)
        else -> erro(nome)
    }
}

fun verificarSenha(): Boolean {
    println("Digite sua senha: ")
    val senha = readln()
    return senha == senha
}

fun verSaldo(nome: String) {
    if (verificarSenha()) {
        println("Seu saldo é $saldo")
    } else {
        println("Senha incorreta. Tente novamente.")
    }
    inicio(nome)
}

fun verExtrato(nome: String) {
    if (verificarSenha()) {
        println("Extrato:")
        if (extrato.isEmpty()) {
            println("Nenhuma transação registrada")
        } else {
            extrato.forEach { println(it) }
        }
    } else {
        println("Senha incorreta. Tente novamente.")
    }
    inicio(nome)
}

fun fazerDeposito(nome: String) {
    if (verificarSenha()) {
        println("Qualo valor do deposito?")
        val deposito = readln().toFloatOrNull()
        if (deposito == null || deposito <= 0) {
            println("Operação não autoprizada. O valor deve ser maior que zero.")
        } else {
            saldo += deposito
            extrato.add("Depósito de $deposito")
            println("O depósito de $deposito realizado com sucesso.")
        }
    }else{
        println("Senha incorreta. Tente novamente")
    }
    inicio(nome)
}

fun fazerSaque(nome: String){
    if (verificarSenha()){
        println("Qual o valor do saque? ")
        val saque = readln().toIntOrNull()
        if (saque == null || saque <= 0){
            println("Operação não autorizada. O valor deve ser maior que zero.")
        }else if (saque > saldo){
            println("Operação não autorizada. Saldo insuficiente.")
        }else{
            saldo -= saque
            extrato.add("Saque de $saque")
            println("Saque de $saque realizado com sucesso.")
        }
    }else{
        println("Senha incorreta. Tente novamente")
    }
    inicio(nome)
}

fun fazerTransferencia(nome: String){
    if (verificarSenha()){
        println("Digite o número da conta para fazer a transferência: ")
        val conta = readln().toIntOrNull()
        if (conta == null){
            println("Operação não autorizada. O número da conta deve ser um número válido.")
            fazerTransferencia(nome)
            return
        }
        println("Qual o valor da transferência: ")
        val transferencia = readln().toFloatOrNull()

        if (transferencia == null || transferencia <= 0){
            println("Operação inválida. O valor deve ser maior que zero.")
        }else if (transferencia > saldo){
            println("Saldo insuficiente.")
        }else{
            saldo -= transferencia
            extrato.add("Transferência de $transferencia para a conta $conta .")
            println("Transferência de $transferencia realizada com sucesso.")
        }
    }else{
        println("Senha incorreta. Tente novamente.")
    }
    inicio(nome)
}

fun erro(nome: String){
    println("Por favor, informe um número válido de 1 a 6.")
    inicio(nome)
}

fun sair(nome: String){
    println("$nome, foi um prazer ter você aqui.")
    exitProcess(0)
}