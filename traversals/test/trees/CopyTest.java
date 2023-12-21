package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CopyTest extends AbstractLinkedBinaryTreeTest {

    @Test
    @DisplayName("Copy of a non-empty tree is equal but independent")
    void testCopy() {
        LinkedBinaryTree<Integer> copyTree = new LinkedBinaryTree<>(tree);

        assertEquals(tree, copyTree, "The copy should be equal to the original");

        copyTree.setRoot(99);
        assertNotEquals(tree.root(), copyTree.root(), "Modifying the copy should not affect the original");
    }
}
