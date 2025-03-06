fun main(){

    fun dol(a:Float) = a / 5.79
    print("Digite quantos reais você tem: ")
    var reais = readln().toFloat()
    var dolar = dol(reais)
    var dolarFormat = String.format("%.2f", dolar).toString()
    println("Convertendo para dólares: US$$dolarFormat")

}