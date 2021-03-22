package O.Q49;

public class Solution {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(11));
    }

    public static int nthUglyNumber(int n) {
        if(n < 7) return n;
        int[] list = new int[n];
        list[0] = 1;
        int x = 1 ,y = 1, z = 1, i = 0;
        int x_pos = 0, y_pos = 0, z_pos = 0;
        while(i != n - 1){
            int temp = Math.min(x * 2, Math.min(y * 3, z * 5));
            list[++i] = temp;
            if(x * 2 == temp){
                x_pos ++;
                x = list[x_pos];
            }
            if(y * 3 == temp){
                y_pos ++;
                y = list[y_pos];
            }
            if(z * 5 == temp){
                z_pos ++;
                z = list[z_pos];
            }
        }
        return list[n - 1];
    }
}
