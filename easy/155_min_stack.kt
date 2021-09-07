//Leetcode #155 - Min Stack
//Runtime: 208 ms, faster than 99.31% of Kotlin online submissions for Min Stack.
//Memory Usage: 42.7 MB, less than 33.10% of Kotlin online submissions for Min Stack.

fun main(args: Array<String>) {
    val mStack = MinStack()
    mStack.push(5)
    mStack.push(-2)
    mStack.push(-4)
    mStack.push(0)
    println(mStack.getMin())
    println(mStack.top())
    mStack.pop()
    mStack.pop()
    println(mStack.getMin())
    println(mStack.top())
}

class MinStack() {

    data class Element(val value: Int, val minPrior: Int)

    val mList = mutableListOf<Element>()
    var minVal = Int.MAX_VALUE

    fun push(`val`: Int) {
        mList.add(Element(`val`, minVal))
        minVal = minVal.coerceAtMost(`val`)
    }

    fun pop() {
        if(!mList.isEmpty()){
            minVal = mList.last().minPrior
            mList.removeAt(mList.lastIndex)
        }

    }

    fun top(): Int {
        return mList[mList.lastIndex].value ?: 0
    }

    fun getMin(): Int {
        return minVal
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */