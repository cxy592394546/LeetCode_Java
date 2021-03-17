package yQ37;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "[]";
            StringBuilder res = new StringBuilder("[");//使用StringBuilders渐少内存浪费
            Queue<TreeNode> queue = new LinkedList() {{
                add(root);
            }};
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    res.append(node.val).append(",");
                    queue.add(node.left);
                    queue.add(node.right);
                } else res.append("null,");
            }
            res.deleteCharAt(res.length() - 1);
            res.append("]");
            return res.toString();

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.length() == 2) return null;
            String[] val = data.substring(1, data.length() - 1).split(",");
            TreeNode root = new TreeNode(Integer.parseInt(val[0]));
            TreeNode head = root;
            Queue<TreeNode> node = new LinkedList();
            node.add(root);
            int i = 1;
            while (!node.isEmpty()) {
                TreeNode cur = node.poll();
                if (cur != null) {
                    if (!val[i].equals("null")) { // 字符串比较应该使用equals()函数
                        cur.left = new TreeNode(Integer.parseInt(val[i]));
                        node.add(cur.left);
                    }
                    i++;
                    if (!val[i].equals("null")) {
                        cur.right = new TreeNode(Integer.parseInt(val[i]));
                        node.add(cur.right);
                    }
                    i++;
                }
            }
            return head;
        }
    }
}
