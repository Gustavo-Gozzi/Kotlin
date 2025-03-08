/*Escreva um programa para aprovar ou não o empréstimo bancário
para a compra de uma casa. O programa vai perguntar o valor da
casa, o salário do comprador e em quantos anos ele vai pagar.
Calcule o valor da prestação mensal, sabendo que ela não pode
exceder 30% do salário ou então o empréstimo será negado.*/

fun main(){
    calculoEmprestimo()

}

fun calculoEmprestimo(){
    println("Digite o valor da casa ↓")
    val valorCasa = readln().toDouble()
    println("Agora o seu salário ↓")
    val salario = readln().toDouble()
    println("Por fim, em quatos anos pretende pagar ↓")
    val anos = readln().toInt()

    val parcela = valorCasa / (anos * 12); println(parcela)
    val porcentagem = salario * 0.3; println(porcentagem)
    val check = parcela < porcentagem

    if(check){
        println("Empréstimo Aprovado!")
    } else {
        println("Empréstimo Negado.")
    }


}