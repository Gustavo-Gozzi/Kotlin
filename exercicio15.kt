/*Escreva um
programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.*/
fun main(){
    print("Digite quantos dias o carro ficou alugado: ")
    val dias = readln().toInt()
    print("Digite quantos quilômetros foram percorridos: ")
    val kmPercorrido = readln().toDouble()

    val total = String.format("%.2f",((dias * 90) + (kmPercorrido * 0.20)))
    println("O valor total a ser cobrado pelo alguel do carro, considerando R$90/dia e R$0.2/km é:")
    print("R$$total")


}