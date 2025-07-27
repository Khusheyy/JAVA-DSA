package TREES;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sucessor {
   public List<List<Integer>> levelOrder(TREES.sucessor.TreeNode root, int key) {
      new LinkedList();
      if (root == null) {
         return null;
      } else {
         Queue<TREES.sucessor.TreeNode> queue = new LinkedList();
         queue.offer(root);

         while(!queue.isEmpty()) {
            int levelsize = queue.size();
            TREES.sucessor.TreeNode currnode = (TREES.sucessor.TreeNode)queue.poll();
            if (currnode.left != null) {
               queue.offer(currnode.left);
            }

            if (currnode.right != null) {
               queue.offer(currnode.right);
            }

            if (currnode.val == key) {
               break;
            }
         }

         return (List)queue.peek();
      }
   }

   public static void main(String[] args) {
      System.out.println("helloooo khusheyyy");
   }
}
