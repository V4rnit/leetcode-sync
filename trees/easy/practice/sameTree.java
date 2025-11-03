package practice;
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

public class sameTree {
    public static boolean similarTree(TreeNode rootOne, TreeNode rootTwo){
        if(rootOne == null && rootTwo == null){
            return true;
        }
        if(rootOne.val != rootTwo.val){
            return false;
        }
        if(rootOne == null || rootTwo == null){
            return false;
        }
        return similarTree(rootOne.left, rootTwo.left) && similarTree(rootOne.right, rootTwo.right);
    }
    public static void main(String args[]) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        boolean check = similarTree(root1, root2);

        if(check == true){
            System.out.println("These two trees are the same");
        }
        else{
            System.out.println("These two trees are not the same");
        }
    
    }
}
