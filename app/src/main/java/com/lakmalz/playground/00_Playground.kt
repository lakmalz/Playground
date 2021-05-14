package com.lakmalz.playground

fun compareStrings(s1: String, s2: String): Int = if (getRemovedString(s1.split("#")) == getRemovedString(s2.split("#"))) {
    1
} else {
    0
}

fun getRemovedString(strList: List<String>): String {
    var edited = ""
    for ((index, value) in strList.withIndex()) {
        if (value.isEmpty() && index != strList.size - 1) {
            edited = edited.dropLast(1)
        }
        edited = "$edited${value.dropLast(1)}"
    }
    return edited.toString().toLowerCase().trim()
}

fun main(args: Array<String>) {
//    val s1 = readLine()!!
//
//    val s2 = readLine()!!
//
//    val result = compareStrings(s1, s2)
//
//    println(result)

}

