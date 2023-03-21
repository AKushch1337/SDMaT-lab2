class LinkedListImpl : LinkedList {
    private val list = mutableListOf<Char>()

    override fun length(): Int {
        return list.size
    }

    override fun append(element: Char) {
        list.add(element)
    }

    override fun insert(element: Char, index: Int) {
        list.add(index, element)
    }

    override fun delete(index: Int): Char {
        return list.removeAt(index)
    }

    override fun deleteAll(element: Char) {
        list.removeAll { it == element }
    }

    override fun get(index: Int): Char {
        return list[index]
    }

    override fun clone(): LinkedListImpl {
        val clonedList = LinkedListImpl()
        clonedList.list.addAll(list)
        return clonedList
    }

    override fun reverse() {
        list.reverse()
    }

    override fun findFirst(element: Char): Int {
        return list.indexOf(element)

    }

    override fun findLast(element: Char): Int {
        return list.lastIndexOf(element)
    }

    override fun clear() {
        list.clear()
    }

    override fun extend(elements: LinkedListImpl) {
        list.addAll(elements.list)
    }
}


