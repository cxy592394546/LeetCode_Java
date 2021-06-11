package Daily.Y21M06.Week2.D11_dp;

public class Q279 {
    public int numSquares(int n) {
        if(n == (int)Math.sqrt(n) * (int)Math.sqrt(n)) return 1;
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            dp[i] = i;
        }
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            for(int j = i * i; j <= n; j++){
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }
}
