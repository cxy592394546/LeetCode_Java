package O.Q07;

import java.util.Arrays;

public class buildTree{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (n == 0) {
            return null;
        }
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (inorder[i] == preorder[0]) {
                end = i;
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[0]);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + end), Arrays.copyOfRange(inorder, 0, end));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + end, n), Arrays.copyOfRange(inorder, end + 1, n));

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}