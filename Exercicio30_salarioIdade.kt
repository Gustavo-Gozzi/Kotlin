/*Desenvolva um programa que leia o nome de um funcionário,
seu salário, quantos anos ele trabalha na empresa e mostre seu
novo salário, reajustado de acordo com a tabela a seguir:
• Até 3 anos de empresa: aumento de 3%
• entre 3 e 10 anos: aumento de 12.5%
• 10 anos ou mais: aumento de 20%*/
fun main(){
    aumentoSalario()
}

fun aumentoSalario(){
    println("Digite o nome do funcionário ↓")
    val nome = readln()
    println("Digite quantidade de anos trabalhados ↓")
    val anosTrabalhados = readln().toInt()
    println("Digite seu salario atual ↓")
    var salario = readln().toDouble()
    val salarioAtual = salario
    if(anosTrabalhados <= 3){
       salario += (salario * 0.03)
    } else if(anosTrabalhados in 4..10){
        salario += (salario * 0.125)
    } else {
        salario += (salario * 0.2)
    }
    println("NOME: $nome" +
            "\nANOS DE EMPRESA: $anosTrabalhados" +
            "\nSALARIO ATUAL: R$$salarioAtual" +
            "\nSALARIO COM REAJUSTE: R$$salario")
}