package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class InOrderIteratorTest extends AbstractLinkedBinaryTreeTest {

    @Test
    @DisplayName("Inorder of a non-empty tree")
    void testInOrderNonEmpty() {
        var list = List.of(2, 4, 1, 5, 3);
        assertEquals(list, iterate(tree.inOrderIterator()), "Inorder should match expected sequence for a non-empty tree");
    }

    @Test
    @DisplayName("Inorder of an empty tree")
    void testInOrderEmpty() {
        assertTrue(iterate(empty.inOrderIterator()).isEmpty(), "Inorder of an empty tree should be empty");
    }

    @Test
    @DisplayName("hasNext and next methods")
    void testHasNextAndNext() {
        var iterator = tree.inOrderIterator();
        assertTrue(iterator.hasNext(), "hasNext should return true if tree is not empty");
        assertEquals(Integer.valueOf(2), iterator.next(), "Next should return the first element in in-order");
    }

    @Test
    @DisplayName("Exception handling for next method")
    void testNextException() {
        var iterator = empty.inOrderIterator();
        assertFalse(iterator.hasNext(), "hasNext should return false for an empty tree");
        assertThrows(NoSuchElementException.class, iterator::next, "Calling next on an empty iterator should throw NoSuchElementException");
    }
}
