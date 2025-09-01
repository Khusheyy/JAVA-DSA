package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import trees.TreeNode;

public class rightview {
   public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new LinkedList();
      if (root == null) {
         return result;
      } else {
         Queue<TreeNode> queue = new LinkedList();
         queue.offer(root);

         while(!queue.isEmpty()) {
            int levelsize = queue.size();
            new LinkedList();

            for(int i = 0; i < levelsize; ++i) {
               TreeNode currnode = (TreeNode)queue.poll();
               if (i == levelsize - 1) {
                  result.add(currnode.val);
               }

               if (currnode.left != null) {
                  queue.offer(currnode.left);
               }

               if (currnode.right != null) {
                  queue.offer(currnode.right);
               }
            }
         }

         return result;
      }
   }

   public static void main(String[] args) {
      System.out.println();
   }
}
