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
public class inorder {
    public static void inorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);

        System.out.println(root.val);

        inorderTraversal(root.right);
    }
    public static void main(String args[]) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.right.right = new TreeNode(5);
        
        System.out.println("The inorder traversal for this tree is: ");

        inorderTraversal(head);
    }
}
