class LinkedListImpl : LinkedList {
    private var head: Node? = null
    private var tail: Node? = null
    private var length = 0

    override fun length(): Int {
        return length
    }

    override fun append(element: Char) {
        val newNode = Node(element)
        if (head == null) {
            head = newNode
            tail = head
        } else {
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
        length++
    }

    override fun insert(element: Char, index: Int) {
        isIndexValid(index)
        val newNode = Node(element)
        when (index) {
            0 -> {
                newNode.next = head
                head?.prev = newNode
                head = newNode
            }

            length -> {
                tail?.next = newNode
                newNode.prev = tail
                tail = newNode
            }

            else -> {
                var currentNode = head
                repeat(index - 1) {
                    currentNode = currentNode?.next
                }
                newNode.prev = currentNode
                newNode.next = currentNode?.next
                currentNode?.next?.prev = newNode
                currentNode?.next = newNode
            }
        }
        length++
    }

    override fun delete(index: Int): Char {
        isIndexValid(index)
        val deletedNode: Node?
        when (index) {
            0 -> {
                deletedNode = head
                head = head?.next
                head?.prev = null
                if (head == null) {
                    tail = null
                }
            }

            (length - 1) -> {
                deletedNode = tail
                tail = tail?.prev
                tail?.next = null
            }

            else -> {
                var currentNode = head
                repeat(index) {
                    currentNode = currentNode?.next
                }
                deletedNode = currentNode
                currentNode?.prev?.next = currentNode?.next
                currentNode?.next?.prev = currentNode?.prev
            }
        }
        length--
        return deletedNode!!.element
    }

    override fun deleteAll(element: Char) {}

    override fun get(index: Int): Char {
        isIndexValid(index)
        var currentNode = head
        repeat(index) {
            currentNode = currentNode?.next
        }
        return currentNode!!.element
    }

    override fun clone(): LinkedListImpl {
        val clonedList = LinkedListImpl()
        var currentNode = head
        while (currentNode != null) {
            clonedList.append(currentNode.element)
            currentNode = currentNode.next
        }
        return clonedList
    }

    override fun reverse() {
        var currentNode = head
        var temp: Node?
        while (currentNode != null) {
            temp = currentNode.next
            currentNode.next = currentNode.prev
            currentNode.prev = temp
            currentNode = temp
        }
        temp = head
        head = tail
        tail = temp
    }

    override fun findFirst(element: Char): Int {
        return 5
    }

    override fun findLast(element: Char): Int {
        return 5
    }

    override fun clear() {
        head = null
        tail = null
        length = 0
    }

    override fun extend(elements: LinkedListImpl) {
        var currentNode = elements.head
        while (currentNode != null) {
            append(currentNode.element)
            currentNode = currentNode.next
        }
    }

    private fun isIndexValid(index: Int) {
        if (index < 0 || index >= length) {
            throw IndexOutOfBoundsException("Index $index is out of bounds for this list. Length: $length")
        }
    }

}