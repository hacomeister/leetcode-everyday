//Leetcode #136 - Single Number Problem Solution in Kotlin
//Runtime: 196 ms, faster than 97.29% of Kotlin online submissions for Single Number.
//Memory Usage: 37.9 MB, less than 65.85% of Kotlin online submissions for Single Number.

fun main(args: Array<String>) {
    val prices = intArrayOf(-5, -5, 3, 10, 3, 10, 8)
    println("Result: " + singleNumber(prices))
}

fun singleNumber(nums: IntArray): Int {

    if(nums.size==1) return nums[0]

    var res = 0

    for (n in nums) {
        res = res xor n
    }

    return res
}