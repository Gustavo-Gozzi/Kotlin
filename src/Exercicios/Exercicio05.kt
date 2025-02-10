fun main(){

    fun media(a:Float, b:Float) = (a + b)/2

    var nota1 = readln().toFloat()
    var nota2 = readln().toFloat()
    var media = media(nota1, nota2)
    println("Nota 1: $nota1 \nNota 2: $nota2 \nMedia: $media")
}