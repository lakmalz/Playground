package com.lakmalz.playground

fun main(args: Array<String>) {
    removeDuplicationElement()
    printDuplicateArrayElements()
}

fun printDuplicateArrayElements() {

    val arr = intArrayOf(1, 2, 3, 4, 2, 7, 8, 8, 3)

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) println(arr[j])
        }
    }
}

fun removeDuplicationElement() { // using HashSet {HashSet is not allowed to saved duplicate element }
    val stringArray = listOf("Android", "iOS", "Window", "Linux", "iOS")
    println("Duplicate list size ${stringArray.size}")

    val hashSet = HashSet<String>(stringArray)
    println("Removed duplicate after array size ${hashSet.size} ")
}