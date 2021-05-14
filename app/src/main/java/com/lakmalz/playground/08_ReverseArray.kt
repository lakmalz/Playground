package com.lakmalz.playground

import androidx.core.content.res.TypedArrayUtils
import java.util.*

fun main(args: Array<String>) {
    val intAry = intArrayOf(101,102,103,104,105)
    val strAry = arrayListOf<String>("One", "Two", "Three","Four", "Five")

    println(intAry.reversedArray().contentToString())
}
