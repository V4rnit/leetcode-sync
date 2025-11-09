package practice2;

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
    public static boolean wrapper(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean checkBST(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val < min || root.val > max) return false;
        return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
    }

    public static void main(String args[]) {
        TreeNode head = new TreeNode(20);
        head.left = new TreeNode(10);
        head.right = new TreeNode(30);
        head.left.left = new TreeNode(5);

        // Call wrapper to test
        if (wrapper(head)) {
            System.out.println("Tree is a valid BST");
        } else {
            System.out.println("Tree is NOT a valid BST");
        }
    }
}
