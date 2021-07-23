//Leetcode #145 - Binary Tree Postorder Traversal in Kotlin
//Runtime: 140 ms, faster than 96.72% of Kotlin online submissions for Binary Tree Postorder Traversal.
//Memory Usage: 34.2 MB, less than 55.74% of Kotlin online submissions for Binary Tree Postorder Traversal.


fun main(args: Array<String>) {
    val firstTree = TreeNode(5)
    firstTree.left = TreeNode(3)
    firstTree.right = TreeNode(2)

    println(postorderTraversal(firstTree))
}

fun postorderTraversal(root: TreeNode?): List<Int> {
    val traversalList = mutableListOf<Int>()

    if(root==null) return traversalList

    traversalList.addAll(postorderTraversal(root.left))
    traversalList.addAll(postorderTraversal(root.right))
    traversalList.add(root.`val`)

    return traversalList

}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}