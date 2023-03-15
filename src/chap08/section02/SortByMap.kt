package chap08.section02

fun main(){
    val fruits = arrayOf("Banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy{it}
            .map{it.toUpperCase()}
            .forEach{println(it)}
}