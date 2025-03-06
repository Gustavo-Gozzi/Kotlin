/*Crie um programa que leia o tamanho de três segmentos
de reta. Analise seus comprimentos e diga se é possível formar um
triângulo com essas retas. Matematicamente, para três segmentos
formarem um triângulo, o comprimento de cada lado deve ser menor
que a soma dos outros dois.*/

fun main(){

    triangulo(2, 1, 10)

}

fun triangulo(segmento_um: Int, segmento_dois: Int, segmento_tres:Int): Boolean{
    if (segmento_um < (segmento_dois + segmento_tres)) {
        if (segmento_dois < (segmento_um + segmento_tres)){
            if(segmento_tres < segmento_um + segmento_dois){
                println("É possível formar um triangulo!")
                println("Segmento 1: $segmento_um" +
                        "\nSegmento 2: $segmento_dois" +
                        "\nSegmento 3: $segmento_tres")
                return true
            } else {
                println("Não é possível formar um triangulo - Segmento Três.")
                return false


            }
        } else {
            println("Não é possível formar um tringulo - Segmento Dois.")
            return false
        }


    } else {
        println("Não é possível formar um triangulo - Segmento Um")
        return false
    }
}
