/*Numa promoção exclusiva para o Dia da Mulher, uma loja quer
dar descontos para todos, mas especialmente para mulheres. Faça
um programa que leia nome, sexo e o valor das compras do cliente
e calcule o preço com desconto. Sabendo que:
• Homens ganham 5% de desconto
• Mulheres ganham 13% de desconto*/
fun main(){

    val nao = arrayOf('n', 'N')
    while(true){
        calculoDesconto()
        println("Quer continuar? ")
        val continuar = readln()
        if(continuar[0] in nao){
            println("Finalizando")
            break
        }

    }


}
fun calculoDesconto(){
    println("Digite seu nome: ")
    val nome = readln()
    println("Digite seu gênero: ")
    val genero = readln()
    println("Digite o valor dar compras: ")
    val compras = readln().toDouble()

    val homem = arrayOf('m', 'M')
    val mulher = arrayOf('f', 'F')
    if(genero[0] in homem){
        val total = compras - (compras * 0.05)
        println("O total foi de $total")
        println("Boas compras, $nome.")
    } else if(genero[0] in mulher){
        val total = compras - (compras * 0.13)
        println("O total foi de $total")
        println("Boas compras, $nome.")
    }
}