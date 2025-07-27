package TREES;

import TREES.Kth.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Kth$Solution {
   Kth$Solution(final Kth param1) {
   }

   public long kthLargestLevelSum(TreeNode root, int k) {
      List<Long> result = new ArrayList();
      Queue<TreeNode> q = new LinkedList();
      q.add(root);

      while(!q.isEmpty()) {
         int n = q.size();
         long sum = 0L;

         for(int i = 0; i < n; ++i) {
            TreeNode node = (TreeNode)q.poll();
            sum += (long)node.val;
            if (node.left != null) {
               q.add(node.left);
            }

            if (node.right != null) {
               q.add(node.right);
            }
         }

         result.add(sum);
      }

      if (k > result.size()) {
         return -1L;
      } else {
         result.sort(Collections.reverseOrder());
         return (Long)result.get(k - 1);
      }
   }
}
