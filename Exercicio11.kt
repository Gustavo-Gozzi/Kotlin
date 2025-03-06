fun main(){
    fun tinta(a:Int, b:Int) = (a * b) / 2

    var largura = readln().toInt()
    var altura = readln().toInt()
    var total = tinta(largura, altura)
    println("Para pintar essa parede que possui " + largura * altura + " de área")
    print("será necessário $total litros de tinta")
}