package com.lakmalz.playground

fun main(args: Array<String>) {
    println("First non repeat value - ${getFirstNonRepeatChar("ACABCCVV").toString()}")
}

/**
 * LinkedHashMap
 */
fun getFirstNonRepeatChar(str: String) : Char?{
    val counts = HashMap<Char, Int>()
    for (c in str.toCharArray()) {
        if (counts.containsKey(c)) {
            counts[c]?.let { counts.put(c, it+1) }
        }else{
            counts[c] = 1
        }
    }

    for (i in str.indices) {
        val c = str[i]
        if(counts[c] == 1){
           return c
        }
    }
    return null
}