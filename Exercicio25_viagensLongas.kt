/*Faça um algoritmo que pergunte a distância que um
passageiro deseja percorrer em Km. Calcule o preço da
passagem, cobrando R$0.50 por Km para viagens até 200Km e
R$0.45 para viagens mais longas.*/

fun main(){
    while(true){
        println("Quantos KM de viagem? ")
        val viagem = readln().toDouble()
        calculaViagem(viagem)
        if(viagem < 0){
            break
        }
    }
}

fun calculaViagem(numero: Double){
    if(numero <= 200.0){
        println("O valor da viagem será R$${0.5 * numero}")
    } else {
        println("O valor da viagem será R$${0.45 * numero}")
    }
}