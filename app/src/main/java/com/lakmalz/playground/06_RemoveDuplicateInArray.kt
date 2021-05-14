package com.lakmalz.playground

fun main(args: Array<String>) {
    val array = intArrayOf(1, 2, 3, 5, 2, 8, 6, 3, 2, 4)

    array.sort()
    var previous = array[0]
    var result = IntArray(array.size)
    result[0] = previous

    for (i in 1 until array.size) {
        val ch = array[i]
        if (previous != ch) {
            result[i] = ch
        }
        previous = ch
    }

    println("Array removed duplicated - ${result.contentToString()}")
}