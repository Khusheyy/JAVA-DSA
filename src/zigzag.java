package TREES;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class zigzag {
   public static List<List<Integer>> zigzagLevelOrder(TREES.zigzag.TreeNode root) {
      List<List<Integer>> result = new LinkedList();
      if (root == null) {
         return result;
      } else {
         Deque<TREES.zigzag.TreeNode> queue = new LinkedList();
         queue.offer(root);
         boolean reverse = false;

         while(!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currlevel = new LinkedList();

            for(int i = 0; i < levelsize; ++i) {
               TREES.zigzag.TreeNode currnode;
               if (!reverse) {
                  currnode = (TREES.zigzag.TreeNode)queue.pollFirst();
                  currlevel.add(currnode.val);
                  if (currnode.left != null) {
                     queue.addLast(currnode.left);
                  }

                  if (currnode.right != null) {
                     queue.addLast(currnode.right);
                  }
               } else {
                  currnode = (TREES.zigzag.TreeNode)queue.pollLast();
                  currlevel.add(currnode.val);
                  if (currnode.right != null) {
                     queue.addFirst(currnode.right);
                  }

                  if (currnode.left != null) {
                     queue.addFirst(currnode.left);
                  }
               }

               reverse = !reverse;
            }

            result.add(currlevel);
         }

         return result;
      }
   }

   public static void main(String[] args) {
      System.out.println("helooo kittu");
   }
}
