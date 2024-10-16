/*
 * This source file was generated by the Gradle 'init' task
 */
package pa5;

/**
 *  Interface for a binary tree implemented using an array
*   The tree must adhere to the properties of a complete binary tree: 
*      A complete binary tree is a binary tree in which every level,
*      The tree is completely filled on all levels except possibly 
*      for the lowest level, which is filled from left to right.
 */
interface ArrayBasedBinaryTree {

    /**
     * Inserts an element into the tree. 
     * Assume `element` is always a positive integer
     */
    void insert(int element);
    
    /**
     * Returns the tree in level order
     */
    String levelOrder();

    /**
     * Returns the tree in in-order
     */
    String inOrder();

    /**
     * Returns the tree in pre-order
     */
    String preOrder();

    /**
     * Returns the tree in post-order
     */
    String postOrder();

    /**
     * Return the length of the longest path in the tree
     */
    int longestPath();

    /**
     * Delete an element from the tree
     * Ensure that the tree remains a complete binary tree
     */
    void delete(int element);
}

// // Uncomment the following code to implement the BinaryTreeArray class
// public class BinaryTreeArray implements ArrayBasedBinaryTree{

public class BinaryTreeArray implements ArrayBasedBinaryTree {
    private int[] tree;
    private int size;
    private int capacity;

    public BinaryTreeArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.tree = new int[initialCapacity];
        this.size = 0;
    }

    public void insert(int element) {
        if (size < capacity) {
            tree[size] = element;
            size = size + 1;
        } 
    }

    public String levelOrder() {
        if (size == 0) {
            return "";
        }

        String result = "";
        for (int i = 0; i < size; i++) {
            result += tree[i] + " ";
        }

        return result.trim();
    }

    public String inOrder() {
        return inOrderHelper(0);
    }

    private String inOrderHelper(int index) {
        if (index >= this.size)
            return "";
        else {
            String left = inOrderHelper(index * 2 + 1);
            String root = this.tree[index] + " ";
            String right = inOrderHelper(index * 2 + 2);
            return left + root + right;
        }
    }

    public String preOrder() {
        return preOrderHelper(0);
    }

    private String preOrderHelper(int index) {
        if (index >= this.size)
            return "";
        else {
            String root = this.tree[index] + " ";
            String left = preOrderHelper(index * 2 + 1);
            String right = preOrderHelper(index * 2 + 2);
            return root + left + right;
        }
    }

    public String postOrder() {
        return postOrderHelper(0);
    }

    private String postOrderHelper(int index) {
        if (index >= this.size)
            return "";
        else {
            String left = postOrderHelper(index * 2 + 1);
            String right = postOrderHelper(index * 2 + 2);
            String root = this.tree[index] + " ";
            return left + right + root;
        }
    }

    public int longestPath() {
        if (size == 0) {
            return 0;
        }
        return longestPathHelper(0);
    }

    private int longestPathHelper(int index) {
        if (index >= size) {
            return 0;
        }

        int left = longestPathHelper(index * 2 + 1);
        int right = longestPathHelper(index * 2 + 2);

        return Math.max(left, right) + 1;
    }

    public void delete(int element) {
        int index = findElementIndex(element);
        if (index == -1) {
            return;
        }
        tree[index] = tree[size - 1];
        size--;
    }

    private int findElementIndex(int element) {
        for (int i = 0; i < size; i++) {
            if (tree[i] == element)
                return i;
        }
        return -1;
    }
   
        public static void main(String[] args){
}   
}
