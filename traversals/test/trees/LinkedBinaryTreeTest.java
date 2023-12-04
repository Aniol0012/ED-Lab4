package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedBinaryTreeTest extends AbstractLinkedBinaryTreeTest {

    // equals

    @Test
    @DisplayName("equals on both empty should be true")
    void equals1() {
        var tree1 = new LinkedBinaryTree<String>();
        var tree2 = new LinkedBinaryTree<String>();
        assertEquals(tree1, tree2);
    }

    @Test
    @DisplayName("equals on the same tree should be true")
    void equals2() {
        assertEquals(tree, tree);
    }

    @Test
    @DisplayName("equals on different trees should be false")
    void equals3() {
        assertNotEquals(tree.left(), tree.right());
    }

    // root

    @Test
    @DisplayName("root should throw NoSuchElementException on empty tree")
    void root1() {
        assertThrows(NoSuchElementException.class, () -> {
            empty.root();
        });
    }

    @Test
    @DisplayName("root on a non-empty tree should return the root")
    void root2() {
        assertEquals(1, tree.root());
    }

    // setRoot

    @Test
    @DisplayName("setRoot on an empty tree should throw NoSuchElementException")
    void setRoot1() {
        assertThrows(NoSuchElementException.class, () -> {
            empty.setRoot(42);
        });
    }

    @Test
    @DisplayName("setRoot on a non-empty tree should replace the root")
    void setRoot2() {
        tree.setRoot(42);
        assertEquals(42, tree.root());
    }

    // left

    @Test
    @DisplayName("left should throw NoSuchElementException on empty tree")
    void left1() {
        assertThrows(NoSuchElementException.class, () -> {
            empty.left();
        });
    }

    @Test
    @DisplayName("left on a non-empty tree should return the left subtree")
    void left2() {
        var expected = new LinkedBinaryTree<>(null, 2, new LinkedBinaryTree<>(null, 4, null));
        assertEquals(expected, tree.left());
    }

    // right

    @Test
    @DisplayName("right should throw NoSuchElementException on empty tree")
    void right1() {
        assertThrows(NoSuchElementException.class, () -> {
            empty.right();
        });
    }

    @Test
    @DisplayName("right on a non-empty tree should return the right subtree")
    void right2() {
        var expected = new LinkedBinaryTree<>(new LinkedBinaryTree<>(null, 5, null), 3, null);
        assertEquals(expected, tree.right());
    }

    // size

    @Test
    @DisplayName("size of empty should return 0")
    void size1() {
        assertEquals(0, empty.size());
    }

    @Test
    @DisplayName("size should compute the size of a tree")
    void size2() {
        assertEquals(5, tree.size());
    }

    // isEmpty
    @Test
    @DisplayName("isEmpty should return true on an empty tree")
    void isEmpty1() {
        assertTrue(empty.isEmpty());
    }

    @Test
    @DisplayName("isEmpty should return false on a non-empty tree")
    void isEmpty2() {
        assertFalse(tree.isEmpty());
    }

}
