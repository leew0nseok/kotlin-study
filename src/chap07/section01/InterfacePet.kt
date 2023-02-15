package chap07.section01

interface Pet{
    var category: String
    val msgTag: String
        get() = "I'm your lovely pet!"

    var species: String

    fun feeding()
    fun patting(){
        println("keeep patting!")
    }
}
class Cat(name: String, override var category: String) : Pet, Animal(name){
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
    override var species: String = "cat"
}

fun main(){
    val obj = Cat("name", "small")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
    println("Pet Message Tags: ${obj.msgTag}")
}