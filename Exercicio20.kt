/*Crie um algoritmo que leia o nome e as duas notas de um aluno,
calcule a sua média e mostre na tela. No final, analise a média e
mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
da média 7.0).*/
fun main(){

    var nome = readln()
    println("Digite suas duas notas: ")
    var nota1 = readln().toDouble()
    var nota2 = readln().toDouble()
    print("A média do aluno $nome é ${media(nota1, nota2)}")
}

fun media(a:Double, b:Double) = (a + b)/2