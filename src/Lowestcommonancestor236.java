package TREES;

public class Lowestcommonancestor236 {
   public Lowestcommonancestor236 lowestCommonAncestor(Lowestcommonancestor236 root, Lowestcommonancestor236 p,Lowestcommonancestor236 q) {
      if (root == null) {
         return null;
      } else if (root != p && root != q) {
         Lowestcommonancestor236 left = this.lowestCommonAncestor(root, p, q);
         Lowestcommonancestor236 right = this.lowestCommonAncestor(root, p, q);
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
