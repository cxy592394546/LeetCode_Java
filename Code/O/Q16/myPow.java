package O.Q16;

public class myPow {
    public double myPow(double x, int n) {
        int base = 1;
        x = n > 0? x: 1/x;
        double ret = 1.0;
        n = Math.abs(n);
        while(n != 0){
            if(base == (n & -n)){
                n -= (n & -n);
                ret *= x;
            }
            x *= x;
            base *= 2;
        }
        return ret;
    }
}
