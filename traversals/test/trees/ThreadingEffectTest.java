package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreadingEffectTest extends AbstractLinkedBinaryTreeTest {

    // shows the effect of threading the left subtree and the inorder traversal
    // this tests should pass after completing exercises 1, 2 & 3

    @Test
    @DisplayName("left subtree is theaded to the whole tree")
    void threading1() {
        var left = tree.left();
        var expected = List.of(2, 4, 1, 5, 3);
        assertEquals(expected, iterate(left.inOrderIterator()));
    }

    @Test
    @DisplayName("right subtree does not have the effect of threading")
    void threading2() {
        var right = tree.right();
        var expected = List.of(5, 3);
        assertEquals(expected, iterate(right.inOrderIterator()));
    }

    @Test
    @DisplayName("to get independent left tree we must copy it")
    void threading3() {
        var left = new LinkedBinaryTree<>(tree.left());
        var expected = List.of(2, 4);
        assertEquals(expected, iterate(left.inOrderIterator()));
    }
}
