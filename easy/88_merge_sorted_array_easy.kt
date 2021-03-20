//Leetcode #88 - Merge Sorted Array Problem Solution in Kotlin
//Runtime: 164 ms, faster than 84.25% of Kotlin online submissions for Merge Sorted Array.
//Memory Usage: 35.3 MB, less than 75.90% of Kotlin online submissions for Merge Sorted Array.

fun main(args: Array<String>) {
    val gas = intArrayOf(1, 2, 3, 0, 0)
    val cost = intArrayOf(1, 2)

    println(merge(gas, 3, cost, 2))
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    var firstIndicator = m - 1
    var secondIndicator = n - 1
    var lastIndicator = m + n - 1

    while (firstIndicator >= 0 || secondIndicator >= 0) {
        if (secondIndicator < 0) {
            return
        }
        if (firstIndicator >= 0 && nums1[firstIndicator] > nums2[secondIndicator]) {
            nums1[lastIndicator] = nums1[firstIndicator]
            firstIndicator -= 1
        } else {
            nums1[lastIndicator] = nums2[secondIndicator]
            secondIndicator -= 1
        }
        lastIndicator -= 1
    }
}