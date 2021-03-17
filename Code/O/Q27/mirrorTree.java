package O.Q27;

public class mirrorTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return root;
        TreeNode temp = new TreeNode(0);
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.right);
        mirrorTree(root.left);
        return root;
    }
}
