//Leetcode #100 - Same Tree Problem Solution in Kotlin
//Runtime: 132 ms, faster than 94.85% of Kotlin online submissions for Same Tree.
//Memory Usage: 33.3 MB, less than 80.41% of Kotlin online submissions for Same Tree.

fun main(args: Array<String>) {
    val firstTree = TreeNode(5)
    firstTree.left = TreeNode(3)
    firstTree.right = TreeNode(2)
    val secondTree = TreeNode(5)
    secondTree.left = TreeNode(3)

    println(isSameTree(firstTree, secondTree))
}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

    if (p == null && q == null) return true
    if (p == null || q == null) return false
    if (p.`val` != q.`val`) return false

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}