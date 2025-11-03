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
public class subTreeAnotherTree {
    public static boolean subTreeSame(TreeNode root, TreeNode subRoot){
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(sameTree(root, subRoot)){
            return true;
        }
        return subTreeSame(root.left, subRoot) || subTreeSame(root.right, subRoot);

    }
    public static boolean sameTree(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1.val != r2.val){
            return false;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        return sameTree(r1.left, r2.left) && sameTree(r1.right, r2.right);
    }
    public static void main(String args[]) {

    }
}
