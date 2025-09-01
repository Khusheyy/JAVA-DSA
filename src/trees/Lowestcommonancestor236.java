package trees;

import trees.TreeNode;

public class Lowestcommonancestor236 {
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null) {
         return null;
      } else if (root != p && root != q) {
         TreeNode left = this.lowestCommonAncestor(root.left, p, q);
         TreeNode right = this.lowestCommonAncestor(root.right, p, q);
         if (left != null && right != null) {
            return root;
         } else {
            return left == null ? right : left;
         }
      } else {
         return root;
      }
   }

   public static void main(String[] args) {
      System.out.println("say my name");
   }
}
