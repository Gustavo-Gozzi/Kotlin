/*Faça um programa que leia o ano de nascimento de uma pessoa,
calcule a idade dela e depois mostre se ela pode ou não votar.*/
import java.time.LocalDateTime
fun main(){
    println("Qual seu ano de nascimento? ")
    val ano = readln().toInt()
    podeVotar(ano)

}

fun podeVotar(ano:Int){

    if(2025 - ano >= 18) print("Já pode votar!") else print("Não pode ainda, aguarde mais ${18 - (2025 - ano)} anos.")

}