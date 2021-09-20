//Leetcode #206 - Reverse Linked List Problem Solution in Kotlin
//Runtime: 164 ms, faster than 73.32% of Kotlin online submissions for Reverse Linked List.
//Memory Usage: 35.9 MB, less than 74.76% of Kotlin online submissions for Reverse Linked List.

fun main(args: Array<String>) {
    val head = ListNode(0).apply {
        next = ListNode(1).apply {
            next = ListNode(3)
        }
    }
}

fun reverseList(head: ListNode?): ListNode? {
    return reverseRecursive(head)
}

private fun reverseRecursive(head: ListNode?, prev: ListNode? = null): ListNode? {
    return if (head == null) prev
    else {
        reverseRecursive(head.next, head).also { head.next = prev }
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}