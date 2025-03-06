fun main(){
    fun centimetro(a:Int) = a * 100
    var numero = readln().toInt()
    var cent = centimetro(numero)
    println("$numero metros equivalem a $cent centímetros")
}