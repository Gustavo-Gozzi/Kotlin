/*Escreva um algoritmo que leia dois números inteiros e compare-
os, mostrando na tela uma das mensagens abaixo:

• O primeiro valor é o maior
• O segundo valor é o maior
• Não existe valor maior, os dois são iguais*/
fun main(){
    var numero1 = 0
    var numero2 = 10
    for(i in 1..10){
        println("Primeiro Valor:$numero1 e Segundo Valor:$numero2")
        verificaMaior(numero1, numero2)
        println("___________________________________")
        numero1 ++
        numero2 --
    }
}

fun verificaMaior(a: Int, b:Int){
    if(a > b){
        println("O primeiro valor ($a) é o Maior.")
    } else if(a < b){
        println("O segundo valor ($b) é o Maior.")
    } else {
        println("Não exsite valor maior, os dois são iguais! $a e $b.")
    }
}