package O.Q44;

public class Solution {
//    public static int findNthDigit(int n) { // 超时
//        if (n < 10) return n;
//        return findLevel(n, 1, 10);
//    }
//
//    public static int findLevel(int n, int level, int pos) {
//        int n_pos = (int) (9* pow(10, level) * ++level + pos);
//        if (n > n_pos) {
//            return findLevel(n, level, n_pos);
//        }
//        int num = (int) ((n - pos) / level + pow(10, level - 1)), mod = (n - pos) % level;
//        return (int) ((num / pow(10, level - mod - 1)) % 10);
//    }

    public int findNthDigit(int n) {
        if(n == 0) {
            return 0;
        }
        int digit = 1;
        long start = 1;
        long count = 9;
        while(n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = digit * start * 9;
        }
        int res = n / digit;
        int rem = n % digit;
        if(rem == 0) {
            return (int)((start + res - 1) % 10);
        } else {
            long num = start + res;
            return Long.toString(num).charAt(rem - 1) - '0';
        }
    }
}
