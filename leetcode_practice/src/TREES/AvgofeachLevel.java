package TREES;

import java.util.LinkedList;
import java.util.*;

public class AvgofeachLevel {

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
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            double avg = 0.00;
            List<Integer> currlevel = new LinkedList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode currnode = queue.poll();
                avg += currnode.val;
                if(currnode.left != null){
                    queue.offer(currnode.left);
                }
                if(currnode.right != null){
                    queue.offer(currnode.right);
                }
            }
            avg = avg / levelsize;
            result.add(avg);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sayy myyyy nameee");
    }
}
