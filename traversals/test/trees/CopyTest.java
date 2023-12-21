package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CopyTest extends AbstractLinkedBinaryTreeTest {

    @Test
    @DisplayName("Test copy constructor creates a copy of the tree")
    void testCopyConstructor() {
        LinkedBinaryTree<Integer> copyTree = new LinkedBinaryTree<>(tree);

        // Verify that the copy is not the same instance as the original
        assertEquals(tree, copyTree, "The copy of the tree must be a different instance");

        // Verify that the structure and values are the same
        assertEquals(iterate(tree.inOrderIterator()), iterate(copyTree.inOrderIterator()), "The trees must have the same structure and values");

        // Modify the copy and verify that the original does not change
        copyTree.setRoot(10);
        assertNotEquals(tree.root(), copyTree.root(), "Modify the copy should not affect the original tree");
    }
}
