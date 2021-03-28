//Leetcode #112 - Path Sum Problem Solution in Kotlin
//Runtime: 184 ms, faster than 57.36% of Kotlin online submissions for Path Sum.
//Memory Usage: 35.8 MB, less than 32.56% of Kotlin online submissions for Path Sum.

fun main(args: Array<String>) {
    val treeNode = TreeNode(-2)
    val treeNodeLeft = null
    val treeNodeRight = TreeNode(-3)
    treeNode.left = treeNodeLeft
    treeNode.right = treeNodeRight

    println(hasPathSum(treeNode, -5))
}

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

    if (root == null) return false
    if (root.`val` == targetSum && root.right == null && root.left == null) return true

    return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}