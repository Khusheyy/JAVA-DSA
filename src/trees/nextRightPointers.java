package trees;

import trees.Node;

public class nextRightPointers {
   public static Node connect(Node root) {
      if (root == null) {
         return null;
      } else {
         for(Node leftmost = root; leftmost != null; leftmost = leftmost.next) {
            for(Node curr = leftmost; curr != null; curr = curr.next) {
               curr.left.next = curr.right;
               if (curr.next != null) {
                  curr.right.next = curr.next.left;
               }
            }
         }

         return root;
      }
   }

   public static void main(String[] args) {
      System.out.println();
   }
}
