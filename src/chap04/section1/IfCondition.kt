package chap04.section1

fun main(){
    val a = 12
    val b = 7

    val max = if (a>b) {
        println("a 선택")
        a
    }
    else {
        println("b 선택")
        b
    }
    println(max)
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score >= 90.0){
        grade = 'A'
    }
    else if(score >= 80.0 && score <= 89.9){
        grade = 'B'
    }
    else if (score >= 70.0 && score <= 79.9){
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}