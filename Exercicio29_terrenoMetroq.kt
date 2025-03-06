/*Faça um programa que leia a largura e o comprimento de
um terreno retangular, calculando e mostrando a sua área em
m². O programa também devemostrar a classificação desse
terreno, de acordo com a lista abaixo:
• Abaixo de 100m² = TERRENO POPULAR
• Entre 100m² e 500m² = TERRENO MASTER
• Acima de 500m² = TERRENO VIP*/

fun main(){
    println("Digite o tamanho da Base e Altura ↓ ")
    val base = readln().toDouble()
    val altura = readln().toDouble()
    val area = calculoTerreno(base, altura)
    println("O terreno possui ${area}m²")
    tipoTerreno(area)

}

fun calculoTerreno(b: Double, h: Double) = b * h

fun tipoTerreno(area: Double){
    if(area < 100.0){
        println("TERRENO POPULaR")
    } else if(area in 100.0..500.0){
        println("TERRENO MASTER")
    } else {
        println("TERRENO VIP")
    }

}