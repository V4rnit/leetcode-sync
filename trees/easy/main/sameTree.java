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
public class sameTree{
    public static void bfs(TreeNode root){
        if(root == null){
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public static boolean same(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        return same(r1.left, r2.left) && same(r1.right,r2.right);
    }
    public static void main(String arrgs[]){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println("The BFS traversal for Tree 1 is: ");
        bfs(root1);
        System.out.println();

        System.out.println("The BFS traversal for Tree 2 is: ");
        bfs(root2);
        System.out.println();

        boolean check = same(root1, root2);

        if(check == true){
            System.out.println("These two trees are the same");
        }
        else{
            System.out.println("These two trees are not the same");
        }
    }
}
