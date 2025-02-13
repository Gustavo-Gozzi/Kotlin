fun main(){
    val items = listOf("Banana", "Queijo", "Pistache")
    var index = 0
    while(index < items.size){
        println("O item $index é ${items[index]}")
        index ++

    }
    for(i in items){
        print(i + ' ')
    }
}