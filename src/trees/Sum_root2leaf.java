package trees;

import trees.TreeNode;

public class Sum_root2leaf {
   int ans = Integer.MIN_VALUE;

   public int sumNumbers(TreeNode root) {
      return this.helper(root, 0);
   }

   private int helper(TreeNode root, int sum) {
      if (root == null) {
         return 0;
      } else {
         sum = sum * 10 + root.val;
         return root.left == null && root.right == null ? sum : this.helper(root.left, sum) + this.helper(root.right, sum);
      }
   }

   public int maxPathSum(TreeNode root) {
      this.helper1(root);
      return this.ans;
   }

   private int helper1(TreeNode node) {
      if (node == null) {
         return 0;
      } else {
         int left = this.helper1(node.left);
         int right = this.helper1(node.right);
         left = Math.max(left, 0);
         right = Math.max(right, 0);
         int pathsum = left + right + node.val;
         this.ans = Math.max(this.ans, pathsum);
         return Math.max(left, right) + node.val;
      }
   }

   public static void main(String[] args) {
      System.out.println("Sum_root2leaf program loaded successfully!");
   }
}
