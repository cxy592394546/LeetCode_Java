package O.Q39;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        else if (nums.length == 0) return -1;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int times = map.get(nums[i]);
                if (times + 1 > nums.length / 2) {
                    return nums[i];
                }
                map.remove(nums[i]);
                map.put(nums[i], times + 1);
            }
        }
        return -1;
    }
}
