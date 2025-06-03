package TREES;

import java.util.*;

public class _buildtree105 {

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


    public void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }

        // Use a queue to perform level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // Get the current node from the front of the queue
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            // Add the left child to the queue if it exists
            if (current.left != null) {
                queue.offer(current.left);
            }

            // Add the right child to the queue if it exists
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }

        int root = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == root){
                index = i;
            }
        }

        TreeNode rootnode = new TreeNode(root);
        rootnode.left = buildTree(java.util.Arrays.copyOfRange(preorder,1,index+1),java.util.Arrays.copyOfRange(inorder,0,index));
        rootnode.right = buildTree(java.util.Arrays.copyOfRange(preorder,index+1,preorder.length),java.util.Arrays.copyOfRange(inorder,index+1,inorder.length));

        return rootnode;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        _buildtree105 tree = new _buildtree105();
        TreeNode root = tree.buildTree(preorder, inorder);
        System.out.println(root.val);
        tree.printTree(root);
        System.out.println();
    }
}
