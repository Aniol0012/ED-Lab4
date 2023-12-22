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
        var expected = List.of(1, 2, 3, 4, 5);
        assertEquals(expected, iterate(tree.levelOrderIterator()), "In-order traversal should match expected sequence");
    }

    @Test
    @DisplayName("In-order traversal of an empty tree")
    void testEmptyTreeTraversal() {
        assertTrue(iterate(empty.levelOrderIterator()).isEmpty(), "In-order traversal of an empty tree should be empty");
    }
}
