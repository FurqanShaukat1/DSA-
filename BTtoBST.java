import java.util.*;

public class BTtoBST {

    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }


    public static void inorderTraversal(TreeNode root, List<Integer> nodes) {
        if (root != null) {
            inorderTraversal(root.left, nodes);
            nodes.add(root.value);
            inorderTraversal(root.right, nodes);
        }
    }

    public static TreeNode convertToBST(TreeNode root, List<Integer> nodes, int[] index) {
        if (root != null) {

            root.left = convertToBST(root.left, nodes, index);

            root.value = nodes.get(index[0]++);

            root.right = convertToBST(root.right, nodes, index);
        }
        return root;
    }


    public static TreeNode binaryTreeToBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);
        Collections.sort(nodes);
        return convertToBST(root, nodes, new int[] {0});
    }


    public static void inorderTraversalPrint(TreeNode root) {
        if (root != null) {
            inorderTraversalPrint(root.left);
            System.out.print(root.value + " ");
            inorderTraversalPrint(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(5);

        System.out.print("Original Binary Tree: ");
        inorderTraversalPrint(root);

        TreeNode bstRoot = binaryTreeToBST(root);

        System.out.print("\nConverted Binary Search Tree: ");
        inorderTraversalPrint(bstRoot);
    }
}

