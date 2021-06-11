package Normal.Pass;

import java.util.HashMap;

public class Q001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(nums[i])){
                ret[0] = map.get(nums[i]);
                ret[1] = i;
                return ret;
            }
            map.put(target - nums[i], i);
        }
        return ret;
    }
}
