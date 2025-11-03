import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    //This is like saying when you create a new tree data structure create it this way.
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class preorder {

    public static void preorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println("The preorder traversal for this tree is: ");
        preorderTraversal(root);
    }
}
