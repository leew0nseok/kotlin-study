package chap08.section02


fun main(){
    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 125.99),
            Product("KeyBoard", 1500.99),
            Product("Tablet", 512.99)
    )
    products.sortBy { it.price }
    products.forEach { println(it) }


}