package practice2;
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
public class height {
    public static int computeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = computeHeight(root.left);
        int rh = computeHeight(root.right);

        return 1 + Math.max(lh,rh);
    }
    public static void main(String[] args){
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.left.left = new TreeNode(99);

        int getHeight = computeHeight(head);

        System.out.println("The height of this tree is: " + getHeight);
    }
    
}
