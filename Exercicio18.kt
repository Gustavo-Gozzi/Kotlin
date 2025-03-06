/*Escreva um programa que pergunte a velocidade de um carro.
Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
cada Km acima da velocidade permitida.*/
fun main(){
    radar()
}

fun radar(){

    println("A quantos quilometros por hora o veículo estava? ")
    val velocidade = readln().toDouble()
    if(velocidade > 80){
        val multa = (velocidade - 80) * 5
        print("Por conta da ultrapassagem do limite de velocidade, será cobrado uma multa de R$${String.format("%.2f",multa)}")
    } else {
        print("Está dentro do limite de velocidade. Parabéns!")
    }

}