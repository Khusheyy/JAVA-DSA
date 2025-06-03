package TREES;

public class Sum_root2leaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    private int helper(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }

        sum = sum*10 + root.val;

        if(root.left == null && root.right == null){
            return sum; // reached the leaf node , thus returning the ans
        }

        return helper(root.left,sum) + helper(root.right,sum);
    }

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper1(root);
        return ans;
    }
    private int helper1(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper1(node.left);
        int right = helper1(node.right);
        // if left or right is -ve then make it 0 , ignore it
        left = Math.max(left,0);
        right = Math.max(right,0);

        int pathsum = left + right + node.val;
        // updating global max
        ans = Math.max(ans,pathsum);
        return Math.max(left,right) + node.val;

    }
}
