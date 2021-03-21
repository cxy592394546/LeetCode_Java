package O.Q45;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{3, 20}));
    }

    public static String minNumber(int[] nums) {
        if (nums.length == 1) return String.valueOf(nums[0]);
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));//使用内置函数定义排序规则
        for (int i = 1; i < nums.length; i++) {
            strs[0] += strs[i];
        }
        return strs[0];
    }
}
