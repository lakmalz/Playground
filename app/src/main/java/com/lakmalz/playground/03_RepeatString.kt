package com.lakmalz.playground

fun main(){
    val s = readLine()!!

    val n = readLine()!!.toLong()

    val result = repeatedString(s, n)

    println(result)
}

fun repeatedString(s: String, n: Long): Long {
    val strLenght = s.length
    var q: Long = 0
    var r: Long = 0
    q = n / strLenght
    r = n % strLenght

    var partialStrLng:Long = r

    return q* getLetterCount(s, s.length.toLong())+getLetterCount(s, partialStrLng)
}

fun getLetterCount( value: String, strLength: Long): Int{
    var count = 0
    for (i in 0 until strLength){
        if(value[i.toInt()] == 'a'){
            count++
        }
    }
    return count
}