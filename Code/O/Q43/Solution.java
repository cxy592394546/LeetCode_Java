package O.Q43;


public class Solution {
    public static void main(String[] args) {
        System.out.println(countDigitOne(1000000000));
    }

    public static int countDigitOne(int n) {
        return getOneNum(n, 0);
    }

    public static int getOneNum(int remain, int times) {// 找到例子9 -> 1 99 > 2 * 10^1 999 -> 3 * 10^2... 递归
        if (remain < 10)
            return remain < 2 ? times : times + 1;
        int part = 0, bit = 0, rate = 1;
        int num = remain;
        while (num >= 10) {
            num /= 10;
            bit++;
            rate *= 10;
        }
        part += rate / 10 * bit;
        int bonus = num == 1 ? remain - num * rate + 1 : rate;
        return getOneNum(remain - num * rate, times + num * part + bonus);
    }
}
