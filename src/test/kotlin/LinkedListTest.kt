import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LinkedListTest {

    private val linkedList: LinkedListImpl = LinkedListImpl()

    @Test
    fun length() {
        assertEquals(0, linkedList.length())
    }

    @Test
    fun append() {
        val length = linkedList.length()
        linkedList.append('a')
        assertEquals(length + 1, linkedList.length())
    }

    @Test
    fun insert() {
    }

    @Test
    fun delete() {
    }

    @Test
    fun deleteAll() {
    }

    @Test
    fun get() {
    }

    @Test
    fun testClone() {
    }

    @Test
    fun reverse() {
    }

    @Test
    fun findFirst() {
    }

    @Test
    fun clear() {
    }

    @Test
    fun extend() {
    }
}