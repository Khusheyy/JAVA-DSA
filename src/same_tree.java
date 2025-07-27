package TREES;

public class same_tree {
   public static boolean isSameTree(TREES.same_tree.TreeNode p, TREES.same_tree.TreeNode q) {
      if (p == null && q == null) {
         return true;
      } else if (p != null && q != null) {
         return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      } else {
         return false;
      }
   }

   public static void main(String[] args) {
   }
   
}
