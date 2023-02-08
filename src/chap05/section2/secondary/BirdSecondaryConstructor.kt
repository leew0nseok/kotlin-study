package chap05.section2.secondary

import chap05.section1.define.Bird

class Bird {
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String ="short"
    var color: String = "blue"

    constructor(name: String, wing: Int, beak:String, color:String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color

    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing col: $vol")

}

fun main(){
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}