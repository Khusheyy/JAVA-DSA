package TREES;
import java.util.*;

public class zigzag {
    public static class TreeNode {
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
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currlevel = new LinkedList<>();
            for (int i = 0; i < levelsize; i++) {
                if (!reverse) {
                    TreeNode currnode = queue.pollFirst(); // remove from front
                    currlevel.add(currnode.val);
                    if (currnode.left != null) {
                        queue.addLast(currnode.left); // add at the last
                    }
                    if (currnode.right != null) {
                        queue.addLast(currnode.right); // add at the last
                    }
                }
                else{
                    TreeNode currnode = queue.pollLast();
                    currlevel.add(currnode.val);
                    if(currnode.right != null){
                        queue.addFirst(currnode.right);
                    }
                    if(currnode.left != null){
                        queue.addFirst(currnode.left);
                    }
                }
                reverse = !reverse;
            }
            result.add(currlevel);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("helooo kittu");
    }
}
