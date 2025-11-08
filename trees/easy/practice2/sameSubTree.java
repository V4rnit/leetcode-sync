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
public class sameSubTree {

    public static boolean checkSameSubTree(TreeNode mainRoot, TreeNode subRoot){
        if(mainRoot == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }
        
        if(sameTree(mainRoot, subRoot)){
            return true;
        }
        return checkSameSubTree(mainRoot.left, subRoot) || checkSameSubTree(mainRoot.right, subRoot);
    }
    public static boolean sameTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
    }
    public static void main(String[] args) {
        // Create main tree
        TreeNode mainRoot = new TreeNode(3);
        mainRoot.left = new TreeNode(4);
        mainRoot.right = new TreeNode(5);
        mainRoot.left.left = new TreeNode(1);
        mainRoot.left.right = new TreeNode(2);
    
        // Create subtree
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
    
        // Test case 1: subRoot is a subtree of mainRoot
        System.out.println(checkSameSubTree(mainRoot, subRoot)); // Expected output: true
    
        // Test case 2: modify subRoot to break the match
        TreeNode subRoot2 = new TreeNode(4);
        subRoot2.left = new TreeNode(1);
        subRoot2.right = new TreeNode(3);
    
        System.out.println(checkSameSubTree(mainRoot, subRoot2)); // Expected output: false
    
        // Test case 3: subRoot is null (should return true)
        System.out.println(checkSameSubTree(mainRoot, null)); // Expected output: true
    
        // Test case 4: mainRoot is null (should return false)
        System.out.println(checkSameSubTree(null, subRoot)); // Expected output: false
    }
    
}
