package whiteboard22;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TreeIntersection {

    public static Set matchingNodes(TreeNode firstTree, TreeNode secondTree) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        // building queues for breadths first traversal so I can go down both trees and compare each node
        Queue<TreeNode> firstQ = new LinkedList<>();
        Queue<TreeNode> secondQ = new LinkedList<>();

        firstQ.add(firstTree);
        secondQ.add(secondTree);

        while (!firstQ.isEmpty() && !secondQ.isEmpty()) {
            TreeNode temp1 = firstQ.remove();
            TreeNode temp2 = secondQ.remove();

            if (temp1.left != null && temp1.right != null && temp2.left != null && temp2.right != null) {
                // adds left and right nodes to both my set and my queue from first temp
                firstSet.add(temp1.left.data);
                firstQ.add(temp1.left);
                firstSet.add(temp1.right.data);
                firstQ.add(temp1.right);
                // adds left and right nodes to both my set and my queue from second temp
                secondSet.add(temp2.left.data);
                secondQ.add(temp2.left);
                secondSet.add(temp2.right.data);
                secondQ.add(temp2.right);

            }
        }
        firstSet.retainAll(secondSet);
        System.out.println(firstSet);
        return firstSet;
    }
}
