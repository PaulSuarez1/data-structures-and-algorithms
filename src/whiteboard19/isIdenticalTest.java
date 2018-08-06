package whiteboard19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isIdenticalTest {

    @Test
    void isIdenticalTest() {

        isIdentical rootOne = new isIdentical();
        TreeNode n531 = new TreeNode(53);

        TreeNode n181 = new TreeNode(18);
        TreeNode n121 = new TreeNode(12);
        TreeNode n241 = new TreeNode(24);

        TreeNode n751 = new TreeNode(75);
        TreeNode n661 = new TreeNode(66);
        TreeNode n991 = new TreeNode(99);

// connect nodes
        rootOne.root = n531;
        n531.left = n181;
        n181.left = n121;
        n181.right = n241;

        n531.right = n751;
        n751.left = n661;
        n751.right = n991;


        isIdentical rootTwo = new isIdentical();
        TreeNode n532 = new TreeNode(53);

        TreeNode n182 = new TreeNode(18);
        TreeNode n122 = new TreeNode(12);
        TreeNode n242 = new TreeNode(24);

        TreeNode n752 = new TreeNode(75);
        TreeNode n662 = new TreeNode(66);
        TreeNode n992 = new TreeNode(99);

// connect nodes
        rootTwo.root = n532;
        n532.left = n182;
        n182.left = n122;
        n182.right = n242;

        n532.right = n752;
        n752.left = n662;
        n752.right = n992;

        boolean expected = true;
        boolean actual = rootOne.isIdentical(rootTwo.root);

        assertEquals(expected, actual);
    }



    @Test
    void isIdenticalTest2() {

        isIdentical rootOne = new isIdentical();
        TreeNode n531 = new TreeNode(0);

        TreeNode n181 = new TreeNode(0);
        TreeNode n121 = new TreeNode(0);
        TreeNode n241 = new TreeNode(0);
        TreeNode n751 = new TreeNode(75);
        TreeNode n661 = new TreeNode(66);
        TreeNode n991 = new TreeNode(99);

// connect nodes
        rootOne.root = n531;
        n531.left = n181;
        n181.left = n121;
        n181.right = n241;

        n531.right = n751;
        n751.left = n661;
        n751.right = n991;




        isIdentical rootTwo = new isIdentical();
        TreeNode n532 = new TreeNode(53);

        TreeNode n182 = new TreeNode(18);
        TreeNode n122 = new TreeNode(12);
        TreeNode n242 = new TreeNode(24);

        TreeNode n752 = new TreeNode(75);
        TreeNode n662 = new TreeNode(66);
        TreeNode n992 = new TreeNode(99);

// connect nodes
        rootTwo.root = n532;
        n532.left = n182;
        n182.left = n122;
        n182.right = n242;

        n532.right = n752;
        n752.left = n662;
        n752.right = n992;

        boolean expected = false;
        boolean actual = rootOne.isIdentical(rootTwo.root);

        assertEquals(expected, actual);
    }

}