package TREES;

public class diameteroftree {


     // Definition for a binary tree node.
      public class TreeNode {
          int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    private int dim = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dim;
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        int dia = left + right;
        dim = Math.max(dim,dia);
        return Math.max(left,right)+1;
    }
}
