

public class buildBST {
   public buildBST.TreeNode sortedArrayToBST(int[] nums) {
      return this.buildbst(nums, 0, nums.length - 1);
   }

   public TREES.buildBST.TreeNode buildbst(int[] nums, int left, int right) {
      if (left > right) {
         return null;
      } else {
         int mid = left + (right - left) / 2;
         TREES.buildBST.TreeNode root = new TREES.buildBST.TreeNode(this, nums[mid]);
         root.left = this.buildbst(nums, left, mid - 1);
         root.right = this.buildbst(nums, mid + 1, right);
         return root;
      }
   }

   public static void main(String[] args) {
      System.out.println();
   }
}
