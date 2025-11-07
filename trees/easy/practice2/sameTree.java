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
public class sameTree {
    public static boolean isSameTree(TreeNode rootOne, TreeNode rootTwo){
        if(rootOne == null && rootTwo == null){
            return true;
        }
        if(rootOne == null || rootTwo == null){
            return false;
        }
        if(rootOne.val != rootTwo.val){
            return false;
        }
        return isSameTree(rootOne.left, rootTwo.left) && isSameTree(rootOne.right, rootTwo.right);
    }
    public static void main(String args[]){
        TreeNode headOne = new TreeNode(1);
        headOne.left = new TreeNode(2);
        headOne.right = new TreeNode(3);

        TreeNode headTwo = new TreeNode(1);
        headTwo.left = new TreeNode(2);
        headTwo.right = new TreeNode(3);

        boolean isSame = isSameTree(headOne, headTwo);

        if(!isSame){
            System.out.println("The two trees are not the same");
        }
        else{
            System.out.println("The two tree are the same");
        }
    }
}
