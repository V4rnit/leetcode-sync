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
    public static int getDiameter(TreeNode root){
        int [] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    public static int height(TreeNode root, int [] diameter){
        if(root == null){
            return 0;
        }
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);

        diameter[0] = Math.max(diameter[0], lh+rh);
        return 1 + Math.max(lh,rh);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println("The diameter of the Tree is: " + getDiameter(root));
    }
}