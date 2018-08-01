package whiteboard17;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
    public BreadthFirstNode rootNode;

    public static void main(String[] args) {
        BreadthFirstNode test1 = new BreadthFirstNode(1);
        BreadthFirstNode n53 = new BreadthFirstNode(53);

        BreadthFirstNode n18 = new BreadthFirstNode(18);
        BreadthFirstNode n12 = new BreadthFirstNode(12);
        BreadthFirstNode n24 = new BreadthFirstNode(24);

        BreadthFirstNode n75 = new BreadthFirstNode(75);
        BreadthFirstNode n66 = new BreadthFirstNode(66);
        BreadthFirstNode n99 = new BreadthFirstNode(99);

// connect nodes
        test1.rootNode = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        breadthFirstTraversal(test1.rootNode);
    }



    public static void breadthFirstTraversal(BreadthFirstNode rootNode) {

        Queue<BreadthFirstNode> queueOfNodes = new LinkedList<BreadthFirstNode>();

        if (rootNode != null) {
            queueOfNodes.add(rootNode);

            while (!queueOfNodes.isEmpty()) {

                BreadthFirstNode newNode = queueOfNodes.poll();
                System.out.println("node data: " + newNode.data); // check types. might have to concatenate with " "

                if (newNode.left != null) {
                    queueOfNodes.add(newNode.left);
                    System.out.println("look left data: " + newNode.left.data);
                }
                if (newNode.right != null) {
                    queueOfNodes.add(newNode.right);
                    System.out.println("look right data: " + newNode.right.data);
                }

            }

        }

    }
}
