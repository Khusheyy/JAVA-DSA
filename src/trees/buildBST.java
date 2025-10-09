
package trees;

import trees.TreeNode;

public class buildBST {
   public TreeNode sortedArrayToBST(int[] nums) {
      return this.buildbst(nums, 0, nums.length - 1);
   }

   public TreeNode buildbst(int[] nums, int left, int right) {
      if (left > right) {
         return null;
      } else {
         int mid = left + (right - left) / 2;
         TreeNode root = new TreeNode(nums[mid]);
         root.left = this.buildbst(nums, left, mid - 1);
         root.right = this.buildbst(nums, mid + 1, right);
         return root;
      }
   }

   public static void main(String[] args) {
      System.out.println("main function");
      System.out.println();
   }
}
