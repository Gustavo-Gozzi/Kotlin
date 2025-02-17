/*Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
hora trabalhada.*/

fun main(){
    print("Digite a quantidade de dias trabalhados: ")
    val dias = readln().toInt()
    val valorHora = (25 * 8).toDouble()
    val total = dias * valorHora
    val salario = String.format("%.2f", total)
    print("O salario é: R$$salario")
}