package TREES;

public class Lowestcommonancestor236 {
   public TREES.Lowestcommonancestor236.TreeNode lowestCommonAncestor(TREES.Lowestcommonancestor236.TreeNode root, TREES.Lowestcommonancestor236.TreeNode p, TREES.Lowestcommonancestor236.TreeNode q) {
      if (root == null) {
         return null;
      } else if (root != p && root != q) {
         TREES.Lowestcommonancestor236.TreeNode left = this.lowestCommonAncestor(root.left, p, q);
         TREES.Lowestcommonancestor236.TreeNode right = this.lowestCommonAncestor(root.right, p, q);
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
