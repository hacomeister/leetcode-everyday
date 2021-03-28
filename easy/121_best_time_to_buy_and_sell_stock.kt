//Leetcode #121 - Best Time to Buy and Sell Stock Problem Solution in Kotlin
//Runtime: 536 ms, faster than 64.52% of Kotlin online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 57.4 MB, less than 55.99% of Kotlin online submissions for Best Time to Buy and Sell Stock.

fun main(args: Array<String>) {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println("Result: " + maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {

    var minPrice = prices[0]
    var profit = 0

    for(price in prices){
        minPrice = minOf(minPrice, price)
        profit = maxOf(profit, price - minPrice)
    }

    return profit
}