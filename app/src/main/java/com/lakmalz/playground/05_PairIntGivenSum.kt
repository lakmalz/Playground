package com.lakmalz.playground

fun main(args: Array<String>){
    getPairSum(intArrayOf( 2,4,3,5,6,-2,4,7,8,9), 7)
}

fun getPairSum(array: IntArray, sum: Int){
    for (i in array.indices){
        val first = array[i]
        for (j in i+1 until array.size){
            val second = array[j]
            if((first+second) == sum){
                println("[$first, $second]")
            }
        }
    }
}