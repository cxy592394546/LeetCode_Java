package Q10_ii;

public class numWays {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int numWays(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int val1 = 0, val2 = 1;
        for(int i = 1; i <= n + 1; i++){
            int temp = val1;
            val1 += val2;
            if(val1 >= 1000000007){
                val1 %= 1000000007;
            }
            val2 = temp;
        }
        return val1;
    }
}
