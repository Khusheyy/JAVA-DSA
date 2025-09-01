package trees;

import java.util.LinkedList;
import java.util.Queue;
import trees.TreeNode;

public class issymmetric {
   public boolean isSymmetric(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList();
      queue.add(root.left);
      queue.add(root.right);

      while(true) {
         TreeNode left;
         TreeNode right;
         do {
            if (queue.isEmpty()) {
               return true;
            }

            left = (TreeNode)queue.poll();
            right = (TreeNode)queue.poll();
         } while(left == null && right == null);

         if (left == null || right == null) {
            return false;
         }

         if (left.val != right.val) {
            return false;
         }

         queue.add(left.left);
         queue.add(right.right);
         queue.add(left.right);
         queue.add(right.left);
      }
   }

   public static void main(String[] args) {
      System.out.println("IsSymmetric program loaded successfully!");
   }
}
