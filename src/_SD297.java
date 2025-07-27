package TREES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _SD297 {
   public List<String> serialize(TREES._SD297.TreeNode node) {
      List<String> list = new ArrayList();
      this.helper(node, list);
      return list;
   }

   void helper(TREES._SD297.TreeNode node, List<String> list) {
      if (node == null) {
         list.add("null");
      } else {
         list.add(String.valueOf(node.val));
         this.helper(node.left, list);
         this.helper(node.right, list);
      }
   }

   public TREES._SD297.TreeNode deserialize(List<String> list) {
      Collections.reverse(list);
      TREES._SD297.TreeNode node = this.helper2(list);
      return node;
   }

   TREES._SD297.TreeNode helper2(List<String> list) {
      String val = (String)list.remove(list.size() - 1);
      if (val.charAt(0) == 'n') {
         return null;
      } else {
         TREES._SD297.TreeNode node = new TREES._SD297.TreeNode(this, Integer.parseInt(val));
         node.left = this.helper2(list);
         node.right = this.helper2(list);
         return node;
      }
   }
}
