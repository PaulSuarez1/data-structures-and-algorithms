package whiteboard20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class flipTest {

    @Test
    void flipTest1() {

        flip rootOne = new flip();
        TreeNode n531 = new TreeNode(53);

        TreeNode n181 = new TreeNode(18);
        TreeNode n121 = new TreeNode(12);
        TreeNode n241 = new TreeNode(24);

        TreeNode n751 = new TreeNode(75);
        TreeNode n661 = new TreeNode(66);
        TreeNode n991 = new TreeNode(99);

// connect nodes
        rootOne.rootNode = n531;
        n531.left = n181;
        n181.left = n121;
        n181.right = n241;

        n531.right = n751;
        n751.left = n661;
        n751.right = n991;


        flip.flip(rootOne.rootNode);

        boolean expected = true;
        System.out.println(rootOne.rootNode.right.data);
        boolean result = rootOne.rootNode.right.data == 18;

        assertEquals(expected, result);

    }

}

// I don't understand... this should work. You can see my console print below and it shows the tree is reversed...
// The method is working. It's reversing my tree. I don't know what I'm getting a null pointer exception...


