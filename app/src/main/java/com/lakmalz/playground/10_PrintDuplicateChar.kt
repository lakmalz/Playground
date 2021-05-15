package com.lakmalz.playground

fun main(args: Array<String>) {
    printDuplicateChar("Programming")
}

fun printDuplicateChar(word: String) {
    val toCharArray = word.toLowerCase().toCharArray()

    val hashMap = HashMap<Char, Int>()
    for (c in toCharArray) {
        if (hashMap.containsKey(c)) {
            hashMap.put(c, hashMap[c]!! +1)
        } else {
            hashMap.put(c, 1)
        }
    }

    val entries = hashMap.entries
    for (entry in entries) {
        if(entry.value>1){
            println("${entry.key} - ${entry.value}")
        }
    }
}