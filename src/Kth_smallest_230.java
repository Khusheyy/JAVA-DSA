package TREES;

public class Kth_smallest_230 {
   int count = 0;

   public TREES.Kth_smallest_230.TreeNode sortedArrayToBST(int[] nums) {
      return this.buildbst(nums, 0, nums.length - 1);
   }

   public TREES.Kth_smallest_230.TreeNode buildbst(int[] nums, int left, int right) {
      if (left > right) {
         return null;
      } else {
         int mid = left + (right - left) / 2;
         TREES.Kth_smallest_230.TreeNode root = new TREES.Kth_smallest_230.TreeNode(this, nums[mid]);
         root.left = this.buildbst(nums, left, mid - 1);
         root.right = this.buildbst(nums, mid + 1, right);
         return root;
      }
   }

   public int kthSmallest(TREES.Kth_smallest_230.TreeNode root, int k) {
      return this.helper(root, k).val;
   }

   public TREES.Kth_smallest_230.TreeNode helper(TREES.Kth_smallest_230.TreeNode root, int k) {
      if (root == null) {
         return null;
      } else {
         TREES.Kth_smallest_230.TreeNode left = this.helper(root.left, k);
         if (left != null) {
            return left;
         } else {
            ++this.count;
            return this.count == k ? root : this.helper(root.right, k);
         }
      }
   }

   public static void main(String[] args) {
      Kth_smallest_230 obj = new Kth_smallest_230();
      obj.sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
      TREES.Kth_smallest_230.TreeNode root = obj.sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
      System.out.println(obj.kthSmallest(root, 6));
      System.out.println("done");
   }
}
