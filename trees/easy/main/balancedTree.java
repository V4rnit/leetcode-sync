import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    //constructor
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class balancedTree{
    public static int isBalanced(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = isBalanced(root.left);
        int rh = isBalanced(root.right);
        if(Math.abs(lh - rh) > 1){
            return -1;
        }
        return 1 + Math.max(lh,rh);
    }
    public static void main(String args[]){
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2) ;
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(4);

        int check = isBalanced(head);

        if(check != 1){
            System.out.println("The tree is Balanced");
        }
        else{
            System.out.println("The tree is not balanced");
        }
    }
}
    

