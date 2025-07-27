package TREES;

public class nextRightPointers {
   public static TREES.nextRightPointers.Node connect(TREES.nextRightPointers.Node root) {
      if (root == null) {
         return null;
      } else {
         for(TREES.nextRightPointers.Node leftmost = root; leftmost != null; leftmost = leftmost.next) {
            for(TREES.nextRightPointers.Node curr = leftmost; curr != null; curr = curr.next) {
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
