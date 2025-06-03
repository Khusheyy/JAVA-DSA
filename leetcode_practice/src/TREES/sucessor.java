package TREES;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sucessor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left,
                 TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // next succesor in order -> using bfs and store it in q before displaying
    public List<List<Integer>> levelOrder(TreeNode root, int key) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelsize = queue.size();
            TreeNode currnode = queue.poll();
            if (currnode.left != null) {
                queue.offer(currnode.left); //add if non empty
            }
            if (currnode.right != null) {
                queue.offer(currnode.right); //add if non-empty
            }
            if (currnode.val == key) {
                break;
            }

        }
        return (List<List<Integer>>) queue.peek();
    }

    public static void main(String[] args) {
        System.out.println("helloooo khusheyyy");
    }
}
