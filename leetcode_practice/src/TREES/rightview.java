package TREES;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightview {
    public class TreeNode {
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currlevel = new LinkedList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode currnode = queue.poll();

                if(i == levelsize-1){
                    result.add(currnode.val);
                }
                if(currnode.left != null){
                    queue.offer(currnode.left);
                }
                if(currnode.right != null){
                    queue.offer(currnode.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
