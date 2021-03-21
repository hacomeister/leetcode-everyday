//Leetcode #108 - Convert Sorted Array to Binary Search Tree Problem Solution in Kotlin
//Runtime: 176 ms, faster than 86.29% of Kotlin online submissions for Convert Sorted Array to Binary Search Tree.
//Memory Usage: 35.8 MB, less than 100.00% of Kotlin online submissions for Convert Sorted Array to Binary Search Tree.

fun main(args: Array<String>) {
    val inputArray = intArrayOf(-10, -3, 0, 5, 9)
    println(sortedArrayToBST(inputArray))
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {

    if (nums.size == 1) return TreeNode(nums[0])

    return findChildrenByDivideAndConquer(nums, 0, nums.lastIndex)
}

fun findChildrenByDivideAndConquer(nums: IntArray, leftIndex: Int, rightIndex: Int): TreeNode? {

    if (leftIndex > rightIndex) return null

    val midIndex = (leftIndex + rightIndex) / 2

    return TreeNode(nums[midIndex]).apply {
        left = findChildrenByDivideAndConquer(nums, leftIndex, midIndex - 1)
        right = findChildrenByDivideAndConquer(nums, midIndex + 1, rightIndex)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}