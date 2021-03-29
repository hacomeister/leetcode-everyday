//Leetcode #108 - Convert Sorted Array to Binary Search Tree Problem Solution in Kotlin
//Runtime: 172 ms, faster than 83.89% of Kotlin online submissions for Convert Sorted Array to Binary Search Tree.
//Memory Usage: 35.8 MB, less than 94.63% of Kotlin online submissions for Convert Sorted Array to Binary Search Tree.

fun main(args: Array<String>) {
    val prices = intArrayOf(-5, 1, 3, 4, 6, 10)
    println("Result: " + sortedArrayToBST(prices))
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {

    if (nums.size == 1) return TreeNode(nums[0])

    return populateTree(nums, 0, nums.lastIndex)
}

fun populateTree(nums: IntArray, leftIndex: Int, rightIndex: Int): TreeNode? {

    if (leftIndex > rightIndex) return null

    val midIndex = (leftIndex + rightIndex) / 2

    return TreeNode(nums[midIndex]).apply {
        left = populateTree(nums, leftIndex, midIndex - 1)
        right = populateTree(nums, midIndex+1, rightIndex)
    }
}

 class TreeNode(var `val`: Int) {
         var left: TreeNode? = null
         var right: TreeNode? = null
     }