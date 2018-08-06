package whiteboard20;

public class flip {
    public TreeNode rootNode;

    public static boolean flip(TreeNode rootNode) {


            if (rootNode == null) {
                return true;
            } else {

                TreeNode left = rootNode.left;
                TreeNode right = rootNode.right;

                rootNode.left = right;
                rootNode.right = left;


                System.out.println("left : " + rootNode.left.data);
                System.out.println("right : " + rootNode.right.data);
                flip(rootNode.left);
                flip(rootNode.right);

            }
            return true;
    }

}

// I don't understand... this should work. You can see my console print below and it shows the tree is reversed...
// The method is working. It's reversing my tree. I don't know what I'm getting a null pointer exception...
