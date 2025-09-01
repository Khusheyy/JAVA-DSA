package trees;

import trees.TreeNode;

public class FlattenBt {
   public void flatten(TreeNode root) {
      for(TreeNode curr = root; curr != null; curr = curr.right) {
         if (curr.left != null) {
            TreeNode temp;
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
