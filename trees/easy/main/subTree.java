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
public class subTree{
    public static boolean sameSubTree(TreeNode root, TreeNode subRoot){
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(sameTree(root, subRoot)){
            return true;
        }
        return sameSubTree(root.left, subRoot) || sameSubTree(root.right,subRoot);
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
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        System.out.println(sameSubTree(root, subRoot));

    }

}