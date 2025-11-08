package practice2;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class diameter {
    public static int wrapper(TreeNode root) {
        int [] diameter = new int[1];
        diameter[0] = getDiameter(root, diameter);
        return diameter[0];
    }
    public static int getDiameter(TreeNode root, int [] diameter){
        if(root == null){
            return 0;
        }
        int lh = getDiameter(root.left, diameter);
        int rh = getDiameter(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
    public static void main(String args[]) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);

        int checkDiameter = wrapper(head);

        System.out.println("The diameter of this tree is: " + checkDiameter);
    }
}
