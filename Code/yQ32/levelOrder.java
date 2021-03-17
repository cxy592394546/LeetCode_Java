package yQ32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] levelOrder(TreeNode root) {  // 逐层遍历
        if(root == null) return new int[0];
        Queue<TreeNode> node = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        node.add(root);
        while(!node.isEmpty()){
            TreeNode cur = node.poll();
            list.add(cur.val);
            if(cur.left != null) node.add(cur.left);
            if(cur.right != null) node.add(cur.right);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
