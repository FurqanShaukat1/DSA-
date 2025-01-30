class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeTasks {

    public static int calculateLevel(Node root) {
        if (root == null)
            return 0;
        int leftHeight = calculateLevel(root.left);
        int rightHeight = calculateLevel(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isCompleteTree(Node root) {
        if (root == null)
            return true;

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.left != null) {
                if (flag)
                    return false;
                queue.add(node.left);
            } else {
                flag = true;
            }

            if (node.right != null) {
                if (flag)
                    return false;
                queue.add(node.right);
            } else {
                flag = true;
            }
        }

        return true;
    }

    public static boolean isFullTree(Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        if (root.left != null && root.right != null)
            return isFullTree(root.left) && isFullTree(root.right);
        return false;
    }

    public static boolean childrenSumProperty(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        if (root.data == leftData + rightData)
            return childrenSumProperty(root.left) && childrenSumProperty(root.right);

        return false;
    }

    public static Node buildTree() {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
        return root;
    }

    public static void main(String[] args) {
        Node root = buildTree();

        // Task 1
        System.out.println("Level of the binary tree: " + calculateLevel(root));

        // Task 2
        System.out.println("Is the tree a complete tree? " + isCompleteTree(root));
        System.out.println("Is the tree a full tree? " + isFullTree(root));

        // Task 3
        System.out.println("Does the tree satisfy the children sum property? " + childrenSumProperty(root));
    }
}

