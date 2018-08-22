package whiteboard22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeIntersectionTest {

    @Test
    void matchingNodes() {
        // first tree:
        TreeNode firstTree = new TreeNode();

        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        firstTree.root = n53;
        firstTree.left = n18;
        n18.left = n12;
        n18.right = n24;

        firstTree.right = n75;
        n75.left = n66;
        n75.right = n99;

        // second tree:
        TreeNode secondTree = new TreeNode();

        TreeNode nn53 = new TreeNode(53);

        TreeNode nn18 = new TreeNode(18);
        TreeNode nn12 = new TreeNode(12);
        TreeNode nn24 = new TreeNode(24);

        TreeNode nn75 = new TreeNode(75);
        TreeNode nn66 = new TreeNode(6666);
        TreeNode nn99 = new TreeNode(9999);

        secondTree.root = nn53;
        secondTree.left = nn18;
        nn18.left = nn12;
        nn18.right = nn24;

        secondTree.right = nn75;
        nn75.left = nn66;
        nn75.right = nn99;

        String result = TreeIntersection.matchingNodes(firstTree, secondTree).toString();
        String expected = "[18, 24, 75, 12]";

        assertEquals(expected, result);
    }
}