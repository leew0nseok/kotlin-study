package chap04.section3

class InvaildNameException(message: String): Exception(message)

fun main(){
    var name = "Kildong123"

    try{
        validateName(name)
    } catch(e: InvaildNameException){
        println(e.message)
    } catch(e : Exception){
        println(e.message)
    }
}

fun validateName(name : String){
    if(name.matches(Regex(".*\\d+.*"))){
        throw InvaildNameException("Your name : $name : contains numerals.")
    }
}