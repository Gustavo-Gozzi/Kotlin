/*Vamos melhorar o jogo que fizemos no exercício
32. A partir de agora, o computador vai sortear um número entre
1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.*/

import kotlin.random.Random

fun main(){
    advinhaNumero2()
}

fun advinhaNumero2(){
    println("Estou pensando em um número de 1 a 10, você tem 4 tentativas: ")
    val maquina = Random.nextInt(1, 10)
    var tentativas = 4

    while(tentativas > 0){

        println("Digite sua escolha aqui ↓")
        val chute1 = readln().toInt()

        if(chute1 == maquina){
            println("Parabéns, você acertou!")
            return
        } else {
            tentativas --
            if(tentativas == 1){ println("Sua última tentativa, cuidado!")
                facilitador(chute1, maquina)

            } else {
                if(tentativas == 0){
                    println("Acabaram suas tentativas, o número era $maquina!")
                    return
                } else {
                    println("Uhh, quase, faltam $tentativas tentativas.")
                    facilitador(chute1, maquina)
                }
            }
        }
    }
}
fun facilitador(numero: Int, maquina: Int){
    println("Quer uma dica? S/N")
    val dica = readln()
    if(dica in "Ss"){
    if(numero > maquina){
        println("O número é menor que $numero.")
    } else {
        println("O número é maior que $numero.")
    }
    } else {
        return
    }


}