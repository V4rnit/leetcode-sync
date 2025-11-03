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
public class invertTree {

        public static TreeNode invertBinTree(TreeNode root){

            if(root == null){
                return null;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertBinTree(root.left);
            invertBinTree(root.right);

            return root;
        }
        public static void bfs(TreeNode root){
            if(root == null){
                return;
            }
            Queue <TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode curr = queue.poll();
                System.out.println(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
       public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        System.out.println("The Binary Tree before inverting is: ");
        bfs(root);

        System.out.println("The Binary Tree after inversting is: ");
        invertBinTree(root);
        bfs(root);
       }
}
