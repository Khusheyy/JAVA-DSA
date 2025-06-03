package TREES;

public class buildBST {

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
        public TreeNode sortedArrayToBST(int[] nums) {
            return buildbst(nums,0,nums.length-1);
        }

        public TreeNode buildbst(int[] nums, int left, int right){

            if(left  > right){
                return null;
            }

            int  mid = left + (right-left)/2;
            TreeNode root = new TreeNode(nums[mid]);

            // Recursively build left and right subtrees
            root.left = buildbst(nums, left, mid - 1);
            root.right = buildbst(nums, mid + 1, right);

            return root;
        }

    public static void main(String[] args) {
        System.out.println();
    }
}
