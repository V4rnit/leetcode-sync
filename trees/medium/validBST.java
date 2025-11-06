import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class validBST {
    public static boolean isValid(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean checkBST(TreeNode root, long min, long max){
        if (root == null) {
            return true;
        }
        // Check if the current node violates the min/max constraints
        if (root.val < min || root.val > max) {
            return false;
        }
        // Recursively check the left and right subtrees with updated constraints
        return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(40);

        System.out.println("Is the tree a valid BST? " + isValid(root));
    }
}