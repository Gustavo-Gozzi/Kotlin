/*Jogo Jokenpo*/
import kotlin.random.Random

fun main(){
    while(true) {
        println("Contra quem deseja jogar? \n[1] Máquina \n[2] Player 2 \n[3] Encerrar \n↓")
        val contraQuem = readln().toInt()
        if(contraQuem == 3){
            println("ENCERRANDO")
            break
        }
        preparacao(contraQuem)

    }
}


fun preparacao(contraQuem: Int){
    val opcoes = listOf("Pedra", "Papel", "Tesoura")
    println("Escolha entre Pedra, Papel ou Tesoura: ")
    val jogador = readln()
    if(contraQuem == 1){
        if(jogador !in opcoes){
            println("Opção inválida, tente novamente.")
            preparacao(contraQuem)

        }
        val maquina = opcoes[Random.nextInt(opcoes.size)]
        println("Maquina escolhe.... $maquina")
        println("$jogador X $maquina")
        jokenpo(jogador, maquina)

    } else if(contraQuem == 2){
        println("Agora o Jogador 2 ↓")
        val jogador2 = readln()
        if(jogador !in opcoes || jogador2 !in opcoes){
            println("Opção inválida, tente novamente.")
            preparacao(contraQuem)

        }
        println("$jogador X $jogador2")
        jokenpo(jogador, jogador2)
    } else {
        println("ERRO... Opção inválida.")
    }

}

fun jokenpo(jogador1: String, jogador2: String){
    if(jogador1 == "Pedra"){
        if (jogador2 == "Pedra") {
            println("EMPATE")
        } else if (jogador2 == "Tesoura") {
            println("Jogador 1 venceu!")
        } else {
            println("Jogador 2 venceu!")
        }
    } else if(jogador1 == "Papel"){
        if (jogador2 == "Pedra") {
            println("Jogador 1 venceu!")
        } else if (jogador2 == "Tesoura") {
            println("Jogador 2 venceu!")
        } else {
            println("EMPATE")
        }
    } else {
        if (jogador2 == "Pedra") {
            println("Jogador 2 venceu!")
        } else if (jogador2 == "Tesoura") {
            println("EMPATE")
        } else {
            println("Jogador 1 venceu!")
        }
    }
}