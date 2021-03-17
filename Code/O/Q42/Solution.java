package O.Q42;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4, 3}));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = sum < 0 ? nums[i] : sum + nums[i];
            max = sum > max ? sum : max;
        }
        return max;
    }
}
