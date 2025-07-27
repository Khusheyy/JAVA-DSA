package TREES;

public class FlattenBt {
   public void flatten(TREES.FlattenBt.TreeNode root) {
      for(TREES.FlattenBt.TreeNode curr = root; curr != null; curr = curr.right) {
         if (curr.left != null) {
            TREES.FlattenBt.TreeNode temp;
            for(temp = curr.left; temp.right != null; temp = temp.right) {
            }

            temp.right = curr.right;
            curr.right = curr.left;
            curr.left = null;
         }
      }

   }

   public static void main(String[] args) {
      System.out.println("say my name");
   }
}
