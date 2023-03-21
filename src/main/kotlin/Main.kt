fun main() {
    val list = LinkedListImpl()
    println("Length of an empty list: ${list.length()}")
    list.append('a') // appending some chars
    list.append('b')
    list.append('c')
    list.append('d')
    println("Length after appending: ${list.length()}")

    println("List for now: ${list.get(0)} ${list.get(1)} ${list.get(2)} ${list.get(3)}")
    println("Element under index 0 before inserting: ${list.get(0)}")
    list.insert('x', 0) // inserting instead of 'a'
    println("Element under index 0 after inserting: ${list.get(0)}")

    println("Length before deleting an element: ${list.length()}")
    println("Deleted char: ${list.delete(0)}")
    println("Length after deleting an element: ${list.length()}")
    println("List after deleting: ${list.get(0)} ${list.get(1)} ${list.get(2)} ${list.get(3)}")

    list.append('a') // appending 1 symbol 4 times to test deleteAll
    list.append('a')
    list.append('a')
    list.append('a')

    println("List after appending additional 'a': ${list.get(0)} ${list.get(1)} ${list.get(2)} ${list.get(3)} ${list.get(4)} ${list.get(5)} ${list.get(6)} ${list.get(7)}")

    println("Length before deleting all 'a': ${list.length()}")
    list.deleteAll('a')
    println("Length after deleting all 'a': ${list.length()}")

    println("List after all 'a': ${list.get(0)} ${list.get(1)} ${list.get(2)}")

    println("Symbol at index 0: ${list.get(0)}")

    val list2 = list.clone()
    println("Cloned list2: ${list2.get(0)} ${list2.get(1)} ${list2.get(2)}")

    println("Symbol at index 0 from list 2: ${list.get(0)}")
    list2.reverse()
    println("Symbol at index 0 from list 2 after reversing: ${list2.get(0)}")
    list.append('d')
    list.append('d')

    println("List for now: ${list.get(0)} ${list.get(1)} ${list.get(2)} ${list.get(3)} ${list.get(4)}")
    println("First occurrence of d: ${list.findFirst('d')}")
    println("Last occurrence of d: ${list.findLast('d')}")
    println("List before extension: ${list.get(0)} ${list.get(1)} ${list.get(2)} ${list.get(3)}")
    list.extend(list2)
    println("Extending list1 with list2. Length: ${list.length()} ")
    println("List after extension: ${list.get(0)} ${list.get(1)} ${list.get(2)} ${list.get(3)} ${list.get(4)} ${list.get(5)} ${list.get(6)} ${list.get(7)}")
    list.clear()
    println("List length after clear: ${list.length()}")
}