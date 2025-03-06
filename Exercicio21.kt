/*Desenvolva um programa que leia um número inteiro e mostre se
ele é PAR ou ÍMPAR.*/
fun main(){
    var count = 0
    while(count < 15){
        parImpar(count)
        count ++
    }

}
fun parImpar(a: Int){
    if(a % 2 > 0){
        println("$a é Impar")
    } else {
        println("$a é Par")
    }

}