/*Escreva um programa em kotlin para calcular a redução do tempo de vida
de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.*/
fun main(){
    print("codigo 1")
    println("Quantidade de cigarros fumados por dia: ")
    val cigarros = readln().toInt()
    if(cigarros > 0){
    println("Quantos anos que fuma: ")
    val anos = readln().toInt()
    var totalCigarros = 0
    for(i in 1..anos){
        totalCigarros += cigarros * 365

    }
    val minutosPerdidos = totalCigarros * 10
    val diasPerdidos = (minutosPerdidos/60) / 24
    print("Ao todo, você perdeu, aproximadamente, $diasPerdidos dias de vida por conta do cigarro.")
    } else {
        print("Parabés! O cigarro não te tirou nenhum dia de vida!")
    }
}