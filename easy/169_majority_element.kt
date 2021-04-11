//Leetcode #169 - Majority Element Problem Solution in Kotlin
//Runtime: 208 ms, faster than 94.15% of Kotlin online submissions for Majority Element.
//Memory Usage: 42.5 MB, less than 47.95% of Kotlin online submissions for Majority Element.

fun main(args: Array<String>) {
    val nums = intArrayOf(5, 3, 10, 10, 5, 5, 5)
    println("Result: " + majorityElement(nums))
}

fun majorityElement(nums: IntArray): Int {
    var counter: Int = 0
    var candidate: Int? = null
    for(number in nums){
        if(counter == 0){
            candidate = number
        }
        counter += if(candidate == number) 1 else -1
    }
    return candidate!!
}