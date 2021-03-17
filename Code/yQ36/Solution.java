package yQ36;

public class Solution {// 中序遍历过程中完成双向列表的创建，最后给头节点的左值和尾节点的右值赋值
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    ;
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        makeList(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void makeList(Node node) {
        if (node == null) return;
        makeList(node.left);
        if (head == null) head = node;
        if (pre != null) {
            node.left = pre;
            pre.right = node;
        }
        pre = node;
        makeList(node.right);
    }
}
