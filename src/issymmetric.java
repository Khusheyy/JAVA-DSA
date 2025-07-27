package TREES;

import java.util.LinkedList;
import java.util.Queue;

public class issymmetric {
   public boolean isSymmetric(TREES.issymmetric.TreeNode root) {
      Queue<TREES.issymmetric.TreeNode> queue = new LinkedList();
      queue.add(root.left);
      queue.add(root.right);

      while(true) {
         TREES.issymmetric.TreeNode left;
         TREES.issymmetric.TreeNode right;
         do {
            if (queue.isEmpty()) {
               return true;
            }

            left = (TREES.issymmetric.TreeNode)queue.poll();
            right = (TREES.issymmetric.TreeNode)queue.poll();
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
}
