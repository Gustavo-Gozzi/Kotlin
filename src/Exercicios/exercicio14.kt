fun main(){
    /*Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/
    println("Informe seu salário: ")
    val salario = readln().toDouble()
    val aumento = salario * 0.15
    val novoSalario = String.format("%.2f", (salario + aumento))
    println("Seu novo salário é: R$$novoSalario")


}