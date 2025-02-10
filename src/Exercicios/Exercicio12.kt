fun main(){

    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()
    var delta = (b * b) - (4 * a * c).toDouble()
    var resultado1 = ((-1 * b) - Math.pow(delta, 0.5)) / (2 * a)
    var resultado2 = ((-1 * b) + Math.pow(delta, 0.5)) / (2 * a)
    println("O valor de bhaskara é $resultado1 e $resultado2")
}