import java.util.*

//Leetcode #144 - Binary Tree Preorder Traversal in Kotlin
//Runtime: 160 ms, faster than 50.98% of Kotlin online submissions for Binary Tree Preorder Traversal.
//Memory Usage: 35.9 MB, less than 14.38% of Kotlin online submissions for Binary Tree Preorder Traversal.

fun main(args: Array<String>) {
    val root = TreeNode(1)
    root.left = null
    root.right = TreeNode(2)
    root.right?.left = TreeNode(3)
    println(preorderTraversal(root))
}

fun preorderTraversal(root: TreeNode?): List<Int> {

    if(root==null) return listOf<Int>()

    val traversalList = mutableListOf<Int>()
    val traversalStack = Stack<TreeNode>()
    traversalStack.push(root)

    while(!traversalStack.isEmpty()){
        val curNode = traversalStack.pop()
        if(curNode!=null){
            traversalList.add(curNode.`val`)
            traversalStack.push(curNode.right)
            traversalStack.push(curNode.left)
        }
    }
    return traversalList
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}