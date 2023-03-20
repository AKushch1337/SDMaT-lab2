import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LinkedListTest {

    private val list: LinkedListImpl = LinkedListImpl()

    @Test
    fun lengthTest() {
        list.append('a')
        list.append('a')
        list.append('a')
        assertEquals(3, list.length())
    }

    @Test
    fun appendTest() {
        val length = list.length()
        list.append('d')
        assertEquals(length + 1, list.length())
    }

    @Test
    fun insertTest() {
        list.append('d')
        list.append('d')
        list.append('d')
        list.append('d')
        list.insert('f', 0)
        list.insert('o', 3)
        assertEquals('f', list.get(0))
        assertEquals('o', list.get(3))
    }

    @Test
    fun deleteTest() {
    }

    @Test
    fun deleteAllTest() {
    }

    @Test
    fun getTest() {
        list.append('g')
        list.append('g')
        list.append('g')
        list.append('o')
        assertEquals('o', list.get(3))
    }

    @Test
    fun cloneTest() {
    }

    @Test
    fun reverseTest() {
    }

    @Test
    fun findFirstTest() {
    }

    @Test
    fun clearTest() {
    }

    @Test
    fun extendTest() {
    }
}