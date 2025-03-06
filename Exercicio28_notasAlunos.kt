/*Crie um programa que leia duas notas de um aluno e calcule
a sua média, mostrando uma mensagem no final, de acordo com a
média atingida:
• Média até 4.9: REPROVADO
• Média entre 5.0 e 6.9: RECUPERAÇÃO
• Média 7.0 ou superior: APROVADO*/

fun main(){
    while(true){
        println("Digite as duas notas ↓")
        val nota1 = readln().toDouble()
        val nota2 = readln().toDouble()
        calculaMedia(nota1, nota2)
        if(nota1 == 11.0){
            println("FINALIZANDO PROGRAMA")
            break
        }
    }
}

fun calculaMedia(nota: Double, nota2: Double){
    val media = (nota + nota2)/ 2
    println("Média: $media")
    if(media < 5.0){
        println("REPROVADO")
    } else if(media < 7.0){
        println("RECUPERAÇÃO")
    } else {
        println("APROVADO")
    }

}