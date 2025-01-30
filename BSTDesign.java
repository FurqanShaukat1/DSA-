public class BSTDesign {

    static class TreeNode {
        String value;
        TreeNode left, right;

        TreeNode(String item) {
            value = item;
            left = right = null;
        }
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }


    public static TreeNode buildExpressionTree() {
        TreeNode root = new TreeNode("/");
        root.left = new TreeNode("*");
        root.right = new TreeNode("+");

        root.left.left = new TreeNode("+");
        root.left.right = new TreeNode("-");

        root.left.left.left = new TreeNode("5");
        root.left.left.right = new TreeNode("2");

        root.left.right.left = new TreeNode("2");
        root.left.right.right = new TreeNode("1");

        root.right.left = new TreeNode("2");
        root.right.right = new TreeNode("9");

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = buildExpressionTree();
        System.out.print("In-order traversal of the expression tree: ");
        inorderTraversal(root);
    }
}

