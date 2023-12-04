package trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class AbstractLinkedBinaryTreeTest {
    final static LinkedBinaryTree<Integer> empty = new LinkedBinaryTree<>();
    final LinkedBinaryTree<Integer> tree =
            new LinkedBinaryTree<>(
                    new LinkedBinaryTree<>(null, 2, new LinkedBinaryTree<>(null, 4, null)),
                    1,
                    new LinkedBinaryTree<>(new LinkedBinaryTree<>(null, 5, null), 3, null)
            );

    // Utility function to simplify tests on iterators
    static <E> List<E> iterate(Iterator<E> it) {
        var list = new ArrayList<E>();
        while (it.hasNext()) {
            list.add(it.next());
        }
        return list;
    }
}
