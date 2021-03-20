//Leetcode #101 - Symmetric Tree Problem Solution in Kotlin
//Runtime: 172 ms, faster than 55.91% of Kotlin online submissions for Symmetric Tree.
//Memory Usage: 40.1 MB, less than 5.00% of Kotlin online submissions for Symmetric Tree.

fun main(args: Array<String>) {
    val firstTree = TreeNode(5)
    firstTree.left = TreeNode(3)
    firstTree.right = TreeNode(3)
    println(isSymmetric(firstTree))
}

fun isSymmetric(root: TreeNode?): Boolean {
    return if (root == null) true
    else isSubtreeSymmetric(root.left, root.right)
}

fun isSubtreeSymmetric(leftNode: TreeNode?, rightNode: TreeNode?): Boolean {
    if (leftNode == null && rightNode == null) return true

    if (leftNode?.`val` != rightNode?.`val`) return false

    return isSubtreeSymmetric(leftNode?.left, rightNode?.right) && isSubtreeSymmetric(leftNode?.right, rightNode?.left)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}