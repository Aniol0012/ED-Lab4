package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderIteratorTest extends AbstractLinkedBinaryTreeTest {

    @Test
    @DisplayName("In-order traversal of a non-empty tree")
    void testInOrderTraversal() {
        var expected = List.of(2, 4, 1, 5, 3);
        assertEquals(expected, iterate(tree.inOrderIterator()), "In-order traversal should match expected sequence");
    }

    @Test
    @DisplayName("In-order traversal of an empty tree")
    void testEmptyTreeTraversal() {
        assertTrue(iterate(empty.inOrderIterator()).isEmpty(), "In-order traversal of an empty tree should be empty");
    }
}
