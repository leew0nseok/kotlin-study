package chap08.section01

class GenericNull<T> {
    fun EqualityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(){
    val obj1 = GenericNull<String>()
    obj1.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)
}