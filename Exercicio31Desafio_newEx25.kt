/*[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
mostrar que tipo de triângulo será formado:
• EQUILÁTERO: todos os lados iguais
• ISÓSCELES: dois lados iguais
• ESCALENO: todos os lados diferentes*/

fun main(){
    println("Digite o valor dos 3 segmentos ↓")
    val seg1 = readln().toInt()
    val seg2 = readln().toInt()
    val seg3 = readln().toInt()
    val a = triangulo(seg1, seg2, seg3)
    if(a) {
        tipoTriangulo(seg1, seg2, seg3)
    }
}
fun tipoTriangulo(a: Int, b:Int, c:Int){
    if(a == b && b == c && a == c){
        println("Triangulo EQUILÁTERO.")
            
        } else if(a == b || b == c || a == c){
            println("Triangulo ISÓCELES.")
        } else{
            println("Triangulo ESCALENO.")
        }

}

