package practice2;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    //Constructor
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class invertTree {
    public static TreeNode invert_tree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert_tree(root.left);
        invert_tree(root.right);

        return root;
    }
    public static void bfs(TreeNode root){
        if(root == null){
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.println(curr.val);
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        // Create sample tree:
        //       4
        //     /   \
        //    2     7
        //   / \   / \
        //  1   3 6   9
    
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println("The bfs traversal for the original tree is: ");
        bfs(root);
    
        // Invert the tree
        TreeNode inverted = invert_tree(root);
        System.out.println("The bfs traversal for the inverted tree is: ");
        bfs(root);
    }
    
}