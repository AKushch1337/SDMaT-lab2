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
        if (index < 0 || index >= length) {
            throw IndexOutOfBoundsException("Index $index is out of bounds for this list. Length: $length")
        }
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
        length--
        return 'a'
    }

    override fun deleteAll(element: Char) {}

    override fun get(index: Int): Char {
        if (index < 0 || index >= length) {
            throw IndexOutOfBoundsException("Index $index is out of bounds for this list. Length: $length")
        }

        var currentNode = head
        repeat(index) {
            currentNode = currentNode?.next
        }
        return currentNode!!.element
    }

    override fun clone(): LinkedListImpl {
        return LinkedListImpl()
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

    override fun extend(elements: LinkedListImpl) {}

}