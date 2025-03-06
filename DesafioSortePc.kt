import kotlin.random.Random

fun main(){
    while(true){
    advinhaNumero()
    println("Quer continuar? S/N ↓")
    val continuar = readln()
        if(continuar in "Nn"){
            println("ENCERRANDO...")
            break
        }
    }
}
fun advinhaNumero(){
    val maquina = Random.nextInt(1, 5)
    println("Pensei em um número de 1 a 5, consegue adivinhas qual? \nDigite aqui ↓")
    val jogador = readln().toInt()
    if(jogador == maquina){
        println("Parabés, você venceu!")
    } else {
        println("Uh, você perdeu... \nO número era $maquina.")
    }
}