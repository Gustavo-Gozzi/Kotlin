fun main(){
    print("Digite o preço: ")
    var preco = readln().toFloat()
    var desc = preco - (preco * 0.05)
    println("O preço com desconto é R$$desc")
}