fun main(){

    fun max(a:Int, b:Int) =
        if(a > b){
            a
        } else {
            b
        }
    var numeroMaximo = max(10, 30)
    print(numeroMaximo)

    fun min(a:Int, b:Int) = if(a > b) a else b

    var numeroMinimo = min(10, 30)
    print(numeroMinimo)

}
