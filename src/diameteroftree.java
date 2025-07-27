package TREES;

public class diameteroftree {
   private int dim = 0;

   public int diameterOfBinaryTree(TREES.diameteroftree.TreeNode root) {
      this.height(root);
      return this.dim;
   }

   private int height(TREES.diameteroftree.TreeNode root) {
      if (root == null) {
         return 0;
      } else {
         int left = this.height(root.left);
         int right = this.height(root.right);
         int dia = left + right;
         this.dim = Math.max(this.dim, dia);
         return Math.max(left, right) + 1;
      }
   }
}
