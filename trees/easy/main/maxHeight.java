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
public class maxHeight {
    public static void bfs(TreeNode root){
        if(root == null){
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.print(curr.val+ " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);

        return 1 + Math.max(leftH, rightH);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);

        System.out.println("The level order traversal for this Binary Tree is: ");
        bfs(root);
        System.out.println();
        int height = getHeight(root);
        System.out.println("The height of this Binary Tree is: " + height);
    }
}
