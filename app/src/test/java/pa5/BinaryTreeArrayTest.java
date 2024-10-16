/*
 * This source file was generated by the Gradle 'init' task
 */
package pa5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BinaryTreeArrayTest {
    @Test
    void testInsert(){
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        assertEquals("1 2 3 4 5 6 7 8 9 10", tree.levelOrder());
    }
    @Test
    public void testInsertAndLevelOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        
        assertEquals("5 3 7", tree.levelOrder());
    }

    @Test
    public void testInOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        
        assertEquals("3 5 7 ", tree.inOrder());
    }

    @Test
    public void testPreOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        
        assertEquals("5 3 7 ", tree.preOrder());
    }

    @Test
    public void testPostOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        
        assertEquals("3 7 5 ", tree.postOrder());
    }

    @Test
    public void testLongestPath() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        
        assertEquals(3, tree.longestPath());
    }

    @Test
    public void testDelete() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.delete(3);
        
        assertEquals("5 7", tree.levelOrder());
    }
}