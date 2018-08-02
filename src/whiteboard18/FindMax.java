package whiteboard18;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {

    public TreeNode rootNode;

    public static void main(String[] args) {
        TreeNode test1 = new TreeNode(53);
        TreeNode n53 = new TreeNode(3);

        TreeNode n18 = new TreeNode(100);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(42342);

        TreeNode n75 = new TreeNode(9);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(18);

// connect nodes
        test1.rootNode = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        Max(test1.rootNode);
    }



    public static int Max (TreeNode root) {
        Queue<TreeNode> findMax = new LinkedList<TreeNode>();

        int maxValue = 0;
        if (root != null) {
            findMax.add(root);
                maxValue  = findMax.peek().data;
            System.out.println("this is the peek to set value to something in the tree: " + maxValue);

            while (!findMax.isEmpty()) {

                TreeNode traversal = findMax.poll();
                System.out.println("node data: " + traversal.data);
                if (traversal.data > maxValue) {
                    maxValue = traversal.data;
                    System.out.println("maxValue set to        " + traversal.data);
                }

                if (traversal.left != null) {
                    findMax.add(traversal.left);
                    System.out.println("look left data: " + traversal.left.data);
                }
                if (traversal.right != null) {
                    findMax.add(traversal.right);
                    System.out.println("look right data: " + traversal.right.data);
                }
            }
        }
        System.out.println("This is the official max value in the the tree:                  " + maxValue);
        return maxValue;
    }
}
