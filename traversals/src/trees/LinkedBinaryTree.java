package trees;

import java.util.*;

/**
 * A binary tree is a tree data structure in which each node has at most two children.
 * This class implements the {@link BinaryTree} interface by using a structure of linked nodes.
 *
 * @param <E> the type of elements in the binary tree
 */
public class LinkedBinaryTree<E> implements BinaryTree<E> {

    /**
     * The root of the binary tree.
     */
    private final Node<E> root;

    void setRoot(E e) {
        if (root == null)
            throw new NoSuchElementException("root of empty tree");
        root.element = e;
    }

    private static class Node<E> {
        Node<E> left;
        E element;
        Node<E> right;
        int size;

        // TODO: Exercise 2
        boolean isRightChild;

        Node(Node<E> left, E element, Node<E> right) {
            this.left = left;
            this.element = element;
            this.right = right;
            this.size = 1 + Node.size(left) + Node.size(right);
            // TODO: Exercise 2
        }

        static <E> Node<E> copy(Node<E> node) {
            // TODO: Exercise 1
            throw new UnsupportedOperationException("Exercise 1");
        }

        Node<E> right() {
            // TODO: Exercise 2
            return right;
        }

        static int size(Node<?> node) {
            return node == null ? 0 : node.size;
        }

        static boolean equals(Node<?> node1, Node<?> node2) {
            if (node1 == null || node2 == null)
                return node1 == node2;
            else
                return node1.size == node2.size
                        && Objects.equals(node1.element, node2.element)
                        && equals(node1.left, node2.left)
                        && equals(node1.right(), node2.right());
        }

    }

    /**
     * Creates an empty binary tree.
     */
    public LinkedBinaryTree() {
        root = null;
    }

    /**
     * Creates a binary tree with the given element as root and the given trees as left and right
     * subtrees.
     *
     * @param elem  the element to be used as root
     * @param left  the left subtree of the new tree. It can be empty of {@code null} if no left
     *              subtree is desired.
     * @param right the right subtree of the new tree. It can be empty of {@code null} if no
     *              right subtree is desired.
     */
    public LinkedBinaryTree(LinkedBinaryTree<E> left, E elem, LinkedBinaryTree<E> right) {
        Node<E> leftChild = left == null ? null : left.root;
        Node<E> rightChild = right == null ? null : right.root;
        root = new Node<>(leftChild, elem, rightChild);
    }


    public LinkedBinaryTree(LinkedBinaryTree<E> tree) {
        // TODO: Exercise 1
        throw new UnsupportedOperationException("TODO: Exercise 1");
    }

    private LinkedBinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Returns the number of elements in this binary tree.
     *
     * @return the number of elements in this binary tree.
     */
    @Override
    public int size() {
        return Node.size(root);
    }

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LinkedBinaryTree<?> bt))
            return false;

        return Node.equals(root, bt.root);
    }

    /**
     * Returns the left subtree of this binary tree.
     *
     * @return the left subtree of this binary tree.
     */
    @Override
    public LinkedBinaryTree<E> left() {
        if (root == null)
            throw new NoSuchElementException("left child of empty tree");

        return new LinkedBinaryTree<>(root.left);
    }

    /**
     * Returns the right subtree of this binary tree.
     *
     * @return the right subtree of this binary tree.
     */
    @Override
    public LinkedBinaryTree<E> right() {
        if (root == null)
            throw new NoSuchElementException("right child of empty tree");

        return new LinkedBinaryTree<>(root.right());
    }

    /**
     * Returns the root element of this binary tree.
     *
     * @return the root element of this binary tree.
     * @throws NoSuchElementException if this binary tree is empty.
     */
    @Override
    public E root() {
        if (root == null)
            throw new NoSuchElementException("root of empty tree");
        return root.element;
    }

    /**
     * Returns an iterator for traversing the binary tree in in-order.
     *
     * @return an iterator for traversing the binary tree in in-order.
     */
    @Override
    public BinaryTreeIterator<E> inOrderIterator() {
        // TODO: Exercise 3
        return new InOrderIterator();
    }

    private class InOrderIterator implements BinaryTreeIterator<E> {

        private Node<E> next;
        private Node<E> lastReturned;

        public InOrderIterator() {
            // TODO: Exercise 3
            throw new UnsupportedOperationException("TODO: Exercise 3");
        }

        /**
         * Replaces the last element returned by {@link #next}
         * with the specified element (optional operation).
         *
         * @param e the element with which to replace the last element returned by
         *          {@code next}
         * @throws IllegalStateException         if  {@code next} have not been called,
         */
        @Override
        public void set(E e) {
            // TODO: Exercise 3
            throw new UnsupportedOperationException("TODO: Exercise 3");
        }

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            // TODO: Exercise 3
            throw new UnsupportedOperationException("TODO: Exercise 3");
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public E next() {
            // TODO: Exercise 3
            throw new UnsupportedOperationException("TODO: Exercise 3");
        }
    }
    /**
     * Returns an iterator for traversing the binary tree in level-order.
     *
     * @return an iterator for traversing the binary tree in level-order.
     */

    // TODO: Exercise 5
    @Override
    public BinaryTreeIterator<E> levelOrderIterator() {
        // TODO: Exercise 4
        throw new UnsupportedOperationException("TODO: Exercise 4");
    }

    // TODO: Exercise 5
    private class LevelOrderIterator implements BinaryTreeIterator<E> {

        private final Deque<Node<E>> queue; // Only non-null nodes are in the queue

        private Node<E> lastReturned;

        LevelOrderIterator() {
            // TODO: Exercise 4
            throw new UnsupportedOperationException("TODO: Exercise 4");
        }

        /**
         * Replaces the last element returned by {@link #next}
         * with the specified element (optional operation).
         *
         * @param e the element with which to replace the last element returned by
         *          {@code next}
         * @throws UnsupportedOperationException if the {@code set} operation
         *                                       is not supported by this list iterator
         * @throws ClassCastException            if the class of the specified element
         *                                       prevents it from being added to this list
         * @throws IllegalArgumentException      if some aspect of the specified
         *                                       element prevents it from being added to this list
         * @throws IllegalStateException         if  {@code next} have not been called,
         */
        @Override
        public void set(E e) {
            // TODO: Exercise 4
            throw new UnsupportedOperationException("TODO: Exercise 4");
        }

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            // TODO: Exercise 4
            throw new UnsupportedOperationException("TODO: Exercise 4");
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public E next() {
            // TODO: Exercise 4
            throw new UnsupportedOperationException("TODO: Exercise 4");
        }
    }
}
