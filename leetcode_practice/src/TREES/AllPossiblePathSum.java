package TREES;

import java.util.*;

public class AllPossiblePathSum {
    public class TreeNode{int val;
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
    int countPath(TreeNode node, int sum){
        List<Integer> path = new LinkedList<>();
        return helper(node,sum,path);

    }

    private int helper(TreeNode node, int sum, List<Integer> path) {
        if(node == null){
            return 0;
        }

        path.add(node.val); // add the root first
        int count = 0;
        int s = 0;

        // paths i can make
        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()){
            s += itr.previous();
            if(s == sum){
                count++;
            }
        }

        count += helper(node.left,s,path) + helper(node.right,s,path);

        // backtrack
        path.remove(path.size()-1);
        return count;
    }
    public static void main(String[] args) {
            AllPossiblePathSum app = new AllPossiblePathSum();

            // Build the tree according to the given structure
            TreeNode root = app.new TreeNode(1);
            root.left = app.new TreeNode(3);
            root.right = app.new TreeNode(2);

            root.left.left = app.new TreeNode(11);
            // root.left.right is null

            // root.right.left is null
            root.right.right = app.new TreeNode(1);

            root.left.left.left = app.new TreeNode(8);
            // root.left.left.right is null

            // root.right.right.left
            root.right.right.left = app.new TreeNode(3);
            root.right.right.right = app.new TreeNode(2);

            // root.left.left.left.left is null
            root.left.left.left.right = app.new TreeNode(2);

            // root.left.left.left.right.left is null
            root.left.left.left.right.right = app.new TreeNode(16);

            // Example: Find paths summing to 7
            int targetSum = 7;
            int result = app.countPath(root, targetSum);
            System.out.println("Number of paths: " + result);
    }
}
