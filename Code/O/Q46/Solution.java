package O.Q46;

public class Solution {
    public static void main(String[] args) {
        System.out.println(translateNum(9));
    }

    public static int translateNum(int num) {// 青蛙跳台阶有的能两级有的不能，f(n) = f(n-1) + f(n-2)
        int pre2 = 0, pre1 = 1, sum = 1;
        char[] chars = String.valueOf(num).toCharArray();
        if(chars.length == 1) return 1;
        for(int i = 1; i< chars.length;i++){
            pre2 = pre1;
            pre1 = sum;
            if(chars[i - 1] == '0' || chars[i - 1] > '2' || (chars[i - 1] == '2' && chars[i] > '5')) continue;
            sum = pre2 + pre1;
        }
        return sum;
    }
}
