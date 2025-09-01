package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import trees.TreeNode;

public class level_order_traversal {
   public static void main(String[] args) {
      System.out.println("helloooo khusheyyy");
   }

   public static List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new LinkedList();
      if (root == null) {
         return result;
      } else {
         Queue<TreeNode> queue = new LinkedList();
         queue.offer(root);

         while(!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currlevel = new LinkedList();

            for(int i = 0; i < levelsize; ++i) {
               TreeNode currnode = (TreeNode)queue.poll();
               currlevel.add(currnode.val);
               if (currnode.left != null) {
                  queue.offer(currnode.left);
               }

               if (currnode.right != null) {
                  queue.offer(currnode.right);
               }
            }

            result.add(currlevel);
         }

         return result;
      }
   }
}
