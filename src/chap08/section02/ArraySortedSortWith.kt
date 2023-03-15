package chap08.section02

data class Product(val name: String, val price: Double)

fun main(){
    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 125.99),
            Product("KeyBoard", 1500.99),
            Product("Tablet", 512.99)
    )
    products.sortWith(
            Comparator<Product>{p1, p2 ->
                when{
                    p1.price > p2.price -> 1
                    p1.price == p2.price -> 0
                    else -> 1
                }

            }
    )
    products.forEach { println(it) }

    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
}