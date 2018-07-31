package whiteboard16;

public  class FizzBuzzTree {
    TreeNode root = null;
    public String FizzBuzzTree (TreeNode current) {
        while (current != null) {
            if(current.left != null) {
                FizzBuzzTree(current.left);
            }

            fizzing(current.data);

            if (current.right != null) {
                FizzBuzzTree(current.right);
            }
        }
        return null;
    }

    public void fizzing(int value) {

        if(value % 3 == 0 && value % 5 == 0) {
            System.out.println(value + " FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println(value + " Fizz");
        } else if (value % 5 == 0) {
            System.out.println(value + " Buzz");
        }
    }
}
