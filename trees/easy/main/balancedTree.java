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

public class balancedTree {
    public static int isBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = isBalanced(root.left);
        if (lh == -1) return -1;  // left subtree not balanced

        int rh = isBalanced(root.right);
        if (rh == -1) return -1;  // right subtree not balanced

        if (Math.abs(lh - rh) > 1) {
            return -1;  // current node not balanced
        }

        return 1 + Math.max(lh, rh); // return height
    }

    public static void main(String args[]) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(4);

        int check = isBalanced(head);

        if (check != -1) {
            System.out.println("The tree is Balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
    }
}
