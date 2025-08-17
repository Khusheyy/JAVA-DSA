package TREES;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgofeachLevel {
   public static List<Double> averageOfLevels(AvgofeachLevel root) {
      List<Double> result = new LinkedList();
      if (root == null) {
         return result;
      } else {
         Queue<AvgofeachLevel> queue = new LinkedList();
         queue.offer(root);

         while(!queue.isEmpty()) {
            int levelsize = queue.size();
            double avg = 0.0D;
            new LinkedList();

            for(int i = 0; i < levelsize; ++i) {
               TREES.AvgofeachLevel.TreeNode currnode = (TREES.AvgofeachLevel.TreeNode)queue.poll();
               avg += (double)currnode.val;
               if (currnode.left != null) {
                  queue.offer(currnode.left);
               }

               if (currnode.right != null) {
                  queue.offer(currnode.right);
               }
            }

            avg /= (double)levelsize;
            result.add(avg);
         }

         return result;
      }
   }

   public static void main(String[] args) {
      System.out.println("sayy myyyy nameee");
      System.out.println("amit pagal ");
   }
}
