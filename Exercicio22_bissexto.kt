/*Faça um algoritmo que leia um determinado ano e mostre se
ele é ou não BISSEXTO.*/
fun main(){
    var ano =  readln().toInt()
    while(ano != 0){
        ehBissexto(ano)
        ano = readln().toInt()
    }


}
fun ehBissexto(numero: Int){
    if((numero % 4 == 0 && numero % 100 != 0) || numero % 400 == 0){
        println("O ano $numero é Bissexto.")
    } else {
        println("O ano $numero não é Bissexto.")
    }
}