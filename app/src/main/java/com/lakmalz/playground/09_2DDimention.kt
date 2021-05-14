package com.lakmalz.playground

import kotlin.math.max

fun main(args: Array<String>) {
    var arr = arrayOf(
            intArrayOf(1, 1, 1, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 2, 4, 4, 0),
            intArrayOf(0, 0, 0, 2, 0, 0),
            intArrayOf(0, 0, 1, 2, 4, 0))

    println(hourGlassSum(arr))
}

private fun hourGlassSum(arr: Array<IntArray>): Int {
    var rows = arr.size
    var columns = arr[0].size

    var maxHourGlassSum = Int.MIN_VALUE

    for (i in 0..(rows - 3)) {
        for (j in 0..(columns - 3)) {
            val currentHourGlassSum =
                arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            maxHourGlassSum = max(maxHourGlassSum, currentHourGlassSum)
        }
    }
    return maxHourGlassSum
}
