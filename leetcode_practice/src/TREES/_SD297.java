package TREES;
import java.util.*;

public class _SD297 {

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

    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode node) {
        List<String> list = new ArrayList<>();
        helper(node,list);
        return list;
    }
    void helper(TreeNode node , List<String> list){
        if(node == null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));

        helper(node.left,list);
        helper(node.right,list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> list) {
         Collections.reverse(list);
         TreeNode node = helper2(list);
         return node;
    }
    TreeNode helper2(List<String> list){
        String val = list.remove(list.size()-1);

        if (val.charAt(0) == 'n') {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}
