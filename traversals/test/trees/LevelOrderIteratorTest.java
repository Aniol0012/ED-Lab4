package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderIteratorTest extends AbstractLinkedBinaryTreeTest {

    @Test
    @DisplayName("Inorder level of a non-empty tree")
    void testInOrderLevel() {
        var expected = List.of(1, 2, 3, 4, 5);
        assertEquals(expected, iterate(tree.levelOrderIterator()));
    }

    @Test
    @DisplayName("Inorder level of an empty tree")
    void testEmptyTreeLevel() {
        assertTrue(iterate(empty.levelOrderIterator()).isEmpty(), "Inorder level of an empty tree should be empty");
    }
}
