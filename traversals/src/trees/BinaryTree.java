package trees;

import java.util.NoSuchElementException;
/**
 * A binary tree is a tree data structure in which each node has at most two children,
 * which are referred to as the left child and the right child.
 *
 * @param <E>
 */
public interface BinaryTree<E> {

    /**
     * Returns the left subtree of this binary tree.
     *
     * @return the left subtree of this binary tree.
     */
    BinaryTree<E> left();

    /**
     * Returns the right subtree of this binary tree.
     *
     * @return the right subtree of this binary tree.
     */
    BinaryTree<E> right();

    /**
     * Returns the root element of this binary tree.
     *
     * @return the root element of this binary tree.
     * @throws NoSuchElementException if this binary tree is empty.
     */
    E root();

    /**
     * Returns the number of elements in this binary tree.
     *
     * @return the number of elements in this binary tree.
     */

    int size();

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements
     */
    boolean isEmpty();

    /**
     * Returns an iterator for traversing the binary tree in in-order.
     *
     * @return an iterator for traversing the binary tree in in-order.
     */
    BinaryTreeIterator<E> inOrderIterator();

    /**
     * Returns an iterator for traversing the binary tree in level-order.
     *
     * @return an iterator for traversing the binary tree in level-order.
     */
    BinaryTreeIterator<E> levelOrderIterator();
}
