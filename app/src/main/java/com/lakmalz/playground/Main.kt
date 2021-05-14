package com.lakmalz.playground

class Main {
    fun main(args: Array<String>) {
        val s = readLine()!!

        val n = readLine()!!.trim().toLong()

        val result = repeatedString(s, n)

        println(result)
    }

    private fun getLetterCount(value: String, strLength: Long): Int{
        var count = 0
        for (i in 0..strLength){
            if(value[i.toInt()] == 'a'){
                count++
            }
        }
        return count
    }

    private fun repeatedString(s: String, n: Long): Long {
        val strLenght = s.length
        var q: Long = 0
        var r: Long = 0
        q = n / strLenght as Long
        r = n % strLenght

        var partialStrLng:Long = r
        var aCount = q* getLetterCount(s, s.length as Long)+getLetterCount(s, partialStrLng)


        return aCount
    }
}