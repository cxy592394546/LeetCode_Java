package Daily.Y21M06.Week2.yD08_01backpack;

public class Solution1049 {
    public static void main(String[] args) {

    }

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int num : stones) sum += num;
        int len = stones.length, weight = sum / 2;
        int[] dp = new int[weight + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = weight; j >= stones[i - 1]; j++) {
                dp[j] = Math.max(dp[j], dp[j - stones[i - 1]] + stones[i - 1]);
            }
        }
        return sum - 2 * dp[weight];
    }
}
