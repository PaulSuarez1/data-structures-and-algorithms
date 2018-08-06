package whiteboard19;

public class isIdentical {
    public TreeNode root;
    public TreeNode rootTwo;

    public boolean isIdentical(TreeNode rootTwo) {
        return isIdentical(root, rootTwo);
    }

    public boolean isIdentical(TreeNode rootOne, TreeNode rootTwo) {
// checks root of each tree
        if(rootOne == null && rootTwo == null) {
            return true;
        }
// checks right and left
        if(rootOne != null && rootTwo != null ) {
            boolean rootNode = rootOne.data == rootTwo.data;

            boolean left = rootOne.left.data == rootTwo.left.data;
            boolean right = rootOne.right.data == rootTwo.right.data;

            boolean areSame = rootNode && left && right;
            return areSame;
        }
        return false;
    }
}
