package chap08.section02

import java.util.*

fun main(){
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray()
    println("ASC: "+ Arrays.toString(sortedNums))

    val sortedNumDesc = arr.sortedArrayDescending()
    println("DEC: "+ Arrays.toString(sortedNumDesc))

    arr.sort(1,3)
    println("ORI: "+ Arrays.toString(arr))
    arr.sortDescending()
    println("ORI: "+ Arrays.toString(arr))

    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: "+ listSorted)
    println("LST: "+ listDesc)

    val items = arrayOf<String>("Dog","Cat", "Lion","Kangaroo","Po")
    items.sortBy{item -> item.length}
    println(Arrays.toString(items))

}