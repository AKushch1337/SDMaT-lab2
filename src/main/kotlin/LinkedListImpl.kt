class LinkedListImpl : LinkedList {
    private var head: Node? = null
    private var tail: Node? = null
    private var length = 0

    override fun length(): Int {
        return length
    }

    override fun append(element: Char) {
        val newNode = Node(element)
        if (tail != null) {
            tail!!.prev = newNode
        } else {
            head = newNode
        }
        tail = newNode
        length++
    }

    override fun insert(element: Char, index: Int) {
        length++
    }

    override fun delete(index: Int): Char {
        length--
        return 'a'
    }

    override fun deleteAll(element: Char) {}

    override fun get(index: Int): Char {
        return 'a'
    }

    override fun clone(): LinkedListImpl {
        return LinkedListImpl()
    }

    override fun reverse() {}

    override fun findFirst(element: Char): Int {
        return 5
    }

    override fun findLast(element: Char): Int {
        return 5
    }

    override fun clear() {}

    override fun extend(elements: LinkedListImpl) {}

}