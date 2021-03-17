package O.Q32_ii;

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> node = new LinkedList();
        List<List<Integer>> ret = new ArrayList();
        if(root == null) return ret;
        node.add(root);
        int hLevel = 1;
        int lLevel = 0;
        List<Integer> list = new ArrayList();
        while(!node.isEmpty()){
            while(hLevel != 1){
                TreeNode cur = node.poll();
                hLevel--;
                list.add(cur.val);
                if(cur.left != null) {
                    node.add(cur.left);
                    lLevel++;
                }
                if(cur.right != null) {
                    node.add(cur.right);
                    lLevel++;
                }
            }
            ret.add(list);
            list = new ArrayList();
            hLevel = lLevel;
            lLevel = 0;
        }
        return ret;
    }
}
