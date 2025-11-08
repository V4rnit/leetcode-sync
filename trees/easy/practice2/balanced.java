package practice2;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class balanced {
    public static boolean is_balanced(TreeNode root){
        if(isBalanced(root) != -1){
            return true;
        }
        return false;
    }
    public static int isBalanced(TreeNode root){
        if(root == null){
            return 1;
        }
        int lh = isBalanced(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = isBalanced(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh - rh) > 1){
            return -1;
        }
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(is_balanced(root)); // true
    }
}
