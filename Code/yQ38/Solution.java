package yQ38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] strs = permutation("aacd");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public static String[] permutation(String s) {
        int len = 1, n = s.length();
        while (n != 0) {
            len *= n;
            n--;
        }
        List<String> ret = new ArrayList();
        boolean[] used = new boolean[s.length()];
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder("");
        dfs(chars, ret, used, sb);
        return ret.toArray(new String[ret.size()]);
    }

    public static void dfs(char[] chars, List<String> ret, boolean[] used, StringBuilder sb) {
        if (sb.length() == chars.length && !ret.contains(sb.toString())) ret.add(sb.toString());
        for (int i = 0; i < chars.length; i++) {
            if (!used[i]) {// 元素相同时进行剪枝
                if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                    continue;
                }
                sb.append(chars[i]);
                used[i] = true;
                dfs(chars, ret, used, sb);
                used[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
