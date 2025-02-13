fun main(){

    fun bhaskara(a:Int, b:Double, c:Int) = Pair((-b + Math.sqrt(Math.pow(b, 2.0) - 4.0 * a * c)) / (2.0 * a), (-b - Math.sqrt(Math.pow(b, 2.0) - 4.0 * a * c)) / (2.0 * a))



    var x = bhaskara(1, 2.0, -3)
    print(x)
}