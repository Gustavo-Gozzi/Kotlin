fun main(){
    fun diminui1(a:Int):Int {
        var x = a - 1
        if(x > 0){
            x = diminui1(x)
        }
        return x
    }
    print(diminui1(10))
}