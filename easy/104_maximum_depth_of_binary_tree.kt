//Leetcode #104 - Maximum Depth of Binary Tree Problem Solution in Kotlin
//Runtime: 180 ms, faster than 35.14% of Kotlin online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 35.3 MB, less than 97.60% of Kotlin online submissions for Maximum Depth of Binary Tree.

fun main(args: Array<String>) {
    val firstTree = TreeNode(5)
    firstTree.left = TreeNode(3)
    firstTree.right = TreeNode(3)
    println(maxDepth(firstTree))
}

fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0
    return maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}