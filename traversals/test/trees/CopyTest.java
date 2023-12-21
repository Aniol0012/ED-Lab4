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

        assertEquals(tree, copyTree, "The copy of the tree must be a different instance");

        assertEquals(iterate(tree.inOrderIterator()), iterate(copyTree.inOrderIterator()), "The trees must have the same structure and values");

        copyTree.setRoot(5);
        assertNotEquals(tree.root(), copyTree.root(), "Modify the copy should not affect the original tree");
    }
}
