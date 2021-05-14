package com.lakmalz.playground

import java.util.*

fun main(args: Array<String>) {
    printMissingNumbers(intArrayOf(1,3,4), 6)//1-6 numbers
}

fun printMissingNumbers(numbers: IntArray, count: Int  ){
    val missingCount = count - numbers.size
    val bitSet = BitSet(count)
    for (num in numbers) {
        bitSet.set(num-1)
    }

    println("Missing numbers in Int array ${numbers.contentToString()}, with total number is $count")
    var lastMissingIndex = 0

    for (i in 1..missingCount step 1) {
        lastMissingIndex = bitSet.nextClearBit(lastMissingIndex) // This method returns next clear array position in the list
        println(++lastMissingIndex)
    }
}