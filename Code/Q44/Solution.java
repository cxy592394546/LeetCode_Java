package Q44;

import static java.lang.Math.pow;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }

    public static int findNthDigit(int n) {
        if(n < 10) return n;
        int level = 2, num = n - 10;
        while(level < 11){
            num -= level * pow(10, level - 1);
            if(num > 0) level++;
            else break;
        }
        System.out.println(level);

        return 0;
    }
}
