//Leetcode #172 - Factorial Trailing Zeroes Problem Solution in Kotlin
//Runtime: 136 ms, faster than 81.40% of Kotlin online submissions for Factorial Trailing Zeroes.
//Memory Usage: 33.4 MB, less than 34.88% of Kotlin online submissions for Factorial Trailing Zeroes.

fun main(args: Array<String>) {
    println(trailingZeroes(30))
}

fun trailingZeroes(n: Int): Int {
    if(n==0) return 0

    return (n/5) + trailingZeroes(n/5)
}