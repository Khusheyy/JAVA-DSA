package TREES;

public class Kth_smallest_230 {

    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

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
        int count = 0;

        public int kthSmallest(TreeNode root, int k) {
            return  helper(root,k).val;
        }
        public TreeNode helper(TreeNode root, int k) {
            // in-order traversal
            if(root == null){
                return null;
            }

            TreeNode left = helper(root.left,k);
            if(left != null){
                return left; // agr ans already mil gya h toh wahi return karo
            }

            count++; // increment each time

            if(count == k){
                return root; // done
            }

            return helper(root.right,k);
        }

    public static void main(String[] args) {

        Kth_smallest_230 obj = new Kth_smallest_230();
        obj.sortedArrayToBST(new int[]{1,2,3,4,5,6,7,8});
        TreeNode root = obj.sortedArrayToBST(new int[]{1,2,3,4,5,6,7,8});
        System.out.println(obj.kthSmallest(root,6));
        System.out.println("done");
    }
}
