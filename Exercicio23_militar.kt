/*Escreva um programa que leia o ano de nascimento de um rapaz e
mostre a sua situação em relação ao alistamento militar.
• Se estiver antes dos 18 anos, mostre em quantos anos
faltam para o alistamento.
• Se já tiver depois dos 18 anos, mostre quantos anos já
se passaram do alistamento.*/
fun main(){
    println("Digite sua idade: ")
    var age = readln().toInt()
    while(age > 0){                       /*Fiz um loop para testar a função inumeras vezes.*/
        cauculoAlistamento(age)
        println("Digite sua idade: ")
        age = readln().toInt()
    }
}
fun cauculoAlistamento(idade: Int){
    if(idade < 18){
        println("Seu alistamento obrigatório ocorrerá em ${18 - idade} anos")
    } else if(idade == 18){
        println("Você possui $idade anos, já está na hora de se alistar!")
    } else{
        println("Já se passaram ${idade - 18} anos do seu alistamento.")
        println("Esperamos que tenha se alistado...")
    }
}